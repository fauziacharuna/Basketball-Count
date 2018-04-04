

# Basketball-Count
Simple Counting Basket Score from udacity

![alt text](https://github.com/fauziacharuna/Basketball-Count/blob/master/image/Screen%20Shot%202018-04-04%20at%2014.10.32.png)
## Getting Started
This simple counting basketball score exercise from udacity course online
## Prerequisites 

The things (engine, virtual, library, IDE) that you might install 

* [Java Virtual Machine (JVM)](http://www.oracle.com/technetwork/java/javasebusiness/downloads/java-archive-downloads-jvm-419420.html)
* [Java Development Kit (JDK 1.8 or higher)](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
* [Software Development Kit](https://developer.android.com/studio/index.html?hl=id)- Android SDK
* [Android Studio 3.0](https://developer.android.com/studio/index.html?hl=id)
* Basic Java OOP concept 

## Material Study

A step by step series of examples that tell you have to get a development env running

### 1. Layout and XML Concept 

#### Linear Layout Vertical
To make content in vertical position from top to the bottom. Firstly, we must define the layout vertical for fill the screen.

![alt text](https://github.com/fauziacharuna/Basketball-Count/blob/master/image/Screen%20Shot%202018-04-04%20at%2013.20.51.png)

```
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/activity_main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:layout_marginTop="100dp"/>
```

#### Linear Layout Horizontal
The next layout, horizontal for the separate view component into two pieces (Team A and Team B) 
![alt text](https://github.com/fauziacharuna/Basketball-Count/blob/master/image/Screen%20Shot%202018-04-04%20at%2013.33.30.png)

```
 <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal"/>
```
#### Liner Layout Weight 
The last for fullfill each pieces with Text, and Button. Using android:layout_weight="1" for divide the proportion 1 : 1

![alt text](https://github.com/fauziacharuna/Basketball-Count/blob/master/image/Screen%20Shot%202018-04-04%20at%2013.34.17.png)
![alt text](https://github.com/fauziacharuna/Basketball-Count/blob/master/image/Screen%20Shot%202018-04-04%20at%2013.34.28.png)

```
  <LinearLayout
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:orientation="vertical"/>
```
### 2. Java Basic Programming
#### Method for increase Score
```
//adding 1
 public void tambah1_A(View view) {
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }
//adding 2
   public void tambah2_A(View view) {
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }
//adding 3
 public void tambah3_A(View view) {
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }
```
#### Method for view score in TextView 

```
//Team A
  public void displayForTeamA(int scoreTeamA) {
        //Inisialisasi Score Text dengan TextView
        TextView scoreViewA = (TextView) findViewById(R.id.tv_scoreA);
        //Merubah tampilan Score dengan method setText()
        scoreViewA.setText(String.valueOf(scoreTeamA));
    }
    
//Team B    
public void displayForTeamB(int scoreTeamB) {
        TextView scoreViewB = (TextView) findViewById(R.id.tv_scoreB);
        scoreViewB.setText(String.valueOf(scoreTeamB));
    }
    
```
#### Method for reset score

```
public void resetScore(View view) {

        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        Toast.makeText(this, "Reset Score", Toast.LENGTH_SHORT).show();
    }
```
#### Method for share the result in another activity 

```
//Share the result in CalculatedActivity
public void share(View view) {
        int scoreA = scoreTeamA;
        int scoreB = scoreTeamB;
        Intent intent = new Intent(MainActivity.this, Calculated.class);
        intent.putExtra("TEAM_A", scoreA);
        intent.putExtra("TEAM_B", scoreB);
        startActivity(intent);
    }
```
#### Method for Toast
```
//Handling condition if the score was zero, draw, and win

  public void saveScore(View view) {

        if ((scoreTeamA == 0) && (scoreTeamB == 0)) {
            Toast.makeText(this, "Please push your score", Toast.LENGTH_SHORT).show();
        } else if (scoreTeamA == scoreTeamB) {
            Toast.makeText(this, "Draw", Toast.LENGTH_SHORT).show();

        } else if ((scoreTeamA > scoreTeamB)) {
            Toast.makeText(this, "Team A Win!", Toast.LENGTH_SHORT).show();

        } else {
            Toast.makeText(this, "Team B Win!", Toast.LENGTH_SHORT).show();

        }

    }
 ```


## License

* [Android Udacity Repository](https://github.com/udacity/Court-Counter) - Court Counter

Copyright 2015 The Android Open Source Project, Inc.

Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.


## Credits

* Google 
* [Udacity - Android Beginner class](https://classroom.udacity.com/courses/ud837)
* [Android Documentation](https://developer.android.com/guide/index.html?hl=id)

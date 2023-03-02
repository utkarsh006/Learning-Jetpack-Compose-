<details><summary><h4> Video1 </h4></summary>

https://user-images.githubusercontent.com/94545831/222369968-a746ccbc-66c5-484c-a346-3cdc647e3263.mp4

  </details>
  
 - If the orientation changes in the above video, the value of counter again sets itself to 0.
 - **How to avoid that?** Save your data inside ```rememberSaveable```

### 3 Ways to create Mutable state variable

```
If, val counter = rememberSaveable { mutableStateOf(0)}
   then, displaying counter value = ${counter.value}
         updating counter value = counter.value ++
        
 ```
 
 <br>
 
 ```
If, val counter by remember { mutableStateOf(0)}
   then, displaying counter value = ${counter}
         updating counter value = counter++
        
  We are getting Int directly in this case.
 ```
<br>
 
 ```
If, val (counter,setCounter) = remember{ mutableStateOf(0)}
   then, displaying counter value = ${counter}
         updating counter value = setCounter(counter+1)
        
  SetCounter updates the values of Counter.
 ```
<br>

<details><summary><h4> Video2 </h4></summary>

https://user-images.githubusercontent.com/94545831/222380935-94e17b47-ccb2-4700-a392-ae9490a337d1.mp4

</details>

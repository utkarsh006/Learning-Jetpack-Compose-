<details><summary><h2> Pic 1 </h2></summary>
  
![Screenshot (362)](https://user-images.githubusercontent.com/94545831/222045322-a4c45b5b-e3ec-474c-a340-43d0cb249f16.png)
  
 </details>

- The package ```ui.theme``` stores all the files needed for designing frontend of our project.
- File ```Theme.kt``` is the mixture of all the 3 files.
- Project name is same as the function name ```HelloWorldTheme``` and this function is responsible for creating theme in our project.
- By default, light theme is enabled.

### But how can we design UI ? 🥱

<details><summary><h2> Pic 2 </h2></summary>
  
![Screenshot (364)](https://user-images.githubusercontent.com/94545831/222046465-bbb7db10-ad91-485d-9056-5fd80c2b5e02.png)
  
</details>

- Component activity() has been extended by main activity and ```setContent``` is a higher order function which is used for designing UI.
- Composable function means we are talking about UI.
- Surface is a white screen.
- Composable function starts with Capital letter.

<details><summary><h2> Pic 3 </h2></summary>
  
![Screenshot (365)](https://user-images.githubusercontent.com/94545831/222047057-6a2df255-e586-438c-aa77-636cf590f54d.png)
  
</details>

- Greeting function is defined here which was called above in setContent.
- ```DefaultPreview function``` is used to view preview of the created layout in Android Studio. It can be removed and the code can run successfully.
- Remove this preview function and run your app.

<p><b>You have successfully printed HelloAndroid on your screen 😄 </b></p>

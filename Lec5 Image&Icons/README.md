- Advise you to read ```Image.kt``` first in your Android Studio.
- We can extract images in 3 ways
  -  **bitmap:** ImageBitmap (Used for raster images, These are the types of images that are produced when scanning or photographing an object. Raster images are compiled 
   using pixels, or tiny dots, containing unique color and tonal information that come together to create the image)
  -  **imageVector:** ImageVector (Vector means to take images from the system)
  -  **painter: Painter** (Painter means to take images from the drawable)

- Whenever we fetch any image from PainterResource it appears **black by default**, so use ```tint = Color.Unspecified```
- Use ```IconButton Composable method``` to apply clickable links on an icon.


<details><summary><h4> Image Layout Implementation </h4></summary>

<img height="400" src="https://user-images.githubusercontent.com/94545831/222328097-f21ae108-cdeb-4892-971a-a7a8b2ced9c6.jpeg" />

</details>


<details><summary><h4> Icon Layout Implementation </h4></summary>

<img height="400" src="https://user-images.githubusercontent.com/94545831/222328118-ced849a2-3fa9-475b-98f4-0bdfbcca8196.jpeg" />

</details>




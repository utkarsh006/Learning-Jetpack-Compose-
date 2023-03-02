- Advise you to read ```Image.kt``` first in your Android Studio.
- We can extract images in 3 ways
  -  **bitmap:** ImageBitmap (Used for raster images, These are the types of images that are produced when scanning or photographing an object. Raster images are compiled 
   using pixels, or tiny dots, containing unique color and tonal information that come together to create the image)
  -  **imageVector:** ImageVector (Vector means to take images from the system)
  -  **painter: Painter** (Painter means to take images from the drawable)

- Whenever we fetch any image from PainterResource it appears **black by default**, so use ```tint = Color.Unspecified```

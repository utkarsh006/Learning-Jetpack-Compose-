### Step 1 
- Go [HERE](https://fonts.google.com/) for custom fonts.
- Select any font and click on download family button.

### Step 2
- Unzip the downloaded file to a certain location ```say a folder at your desktop``` and copy the file having ttf (true type font) extension inside static folder.
- Go to Android Studio and Right click on ```res -> new -> Folder (Below Activity and Fragment) -> FontFolder```
- Paste the ttf file having name as myFont

### Step 3

- Go to Ui package and then to Type.kt
- Declare your customFont like this : ```val customFont = FontFamily(Font(R.font.myFont))```
- Use it inside your code as : fontFamily = customFont (see the kotlin file in this folder for more reference)

# JetpackUnsplash
Jetpack is a suite of libraries to help developers follow best practices, reduce boilerplate code, and write code that works consistently across Android versions and devices so that developers can focus on the court they care about.

This is a demo project for [GDG Kisumu](https://twitter.com/gdg_kisumu) for the Android Jetpack Meetup.


## Using Unsplash API

Register and get your ACCESS KEY from unsplash [here](https://unsplash.com/developers). There are well detailed instuctions on how to create an app and get your access key.

After you get the access key, start by creating a resource file for your secrets called res/values/secrets.xml with a string pair unsplash_access_key value:
```
<!-- Inside of `res/values/secrets.xml` -->
<?xml version="1.0" encoding="utf-8"?>
<resources>
    <string name="unsplash_access_key">xxxxxx</string>
</resources>
```
Once this key are in the file, Android will automatically merge it into your resources, where you can access them exactly as you would your normal strings. You can access the secret values in your Kotlin code with:

// inside of an Activity, `getString` is called directly
```
String unsplashAccessKey = getString(R.string.unsplash_access_key);
// inside of another class (requires a context object to exist)
String unsplashAccessKey = context.getString(R.string.unsplash_access_key);
```

# Festival Lineup App

An Android application that displays a music festival lineup, allowing users to view scheduled performers by stage.

## Features

- Display a list of stages (Stage A, B, C)
- Expandable/collapsible stage sections
- Only one stage can be expanded at a time
- Shows performer schedule when a stage is expanded
- Clean and responsive UI using Jetpack Compose

## Demo

A demo video showing the app's functionality can be found in the `doc` directory:
- [App Demo Video](doc/miniChallenge1_September_2025_TheFestivalLineUp.webm)

## Project Structure

```
app/
├── src/
│   └── main/
│       ├── java/com/example/thefestivalminichallenge1/
│       │   ├── data/           # Data layer with repositories
│       │   ├── domain/         # Domain models
│       │   └── presenter/      # UI layer (ViewModel, UI models, mappers)
│       └── res/               # Resources
doc/                          # Documentation and demo materials
├── miniChallenge1_September_2025_TheFestivalLineUp.webm
```

## Implementation Details

- Built with Kotlin and Jetpack Compose
- Uses MVVM architecture pattern
- Implements expandable/collapsible UI components
- Static data implementation (no network calls)
- No third-party libraries used

## Features Showcase

The app demonstrates the following key interactions:
1. Tap a stage to expand and show performers
2. Tap another stage to switch (previous stage collapses)
3. Tap an expanded stage to collapse it

## Technical Stack

- Kotlin
- Jetpack Compose
- Material Design 3
- ViewModel
- StateFlow for state management

# Festival Lineup App

An Android application that displays a music festival lineup, allowing users to view scheduled
performers by stage.

## Context

This project was created for the September Mini Challenges in the Mobile Dev Campus by Philipp
Lackner, using the provided Figma design and instructions.  
If you are interested in joining the Campus, you can register
here: [https://pl-coding.com/campus/](https://pl-coding.com/campus/)

## Features

- Display a list of stages (Stage A, B, C)
- Expandable/collapsible stage sections
- Only one stage can be expanded at a time
- Shows performer schedule when a stage is expanded
- Clean and responsive UI using Jetpack Compose

## Demo

<img src="doc/miniChallenge1_September_2025_TheFestivalLineUp.gif" width="400" alt="demo app preview"/>

The demo shows:

1. Expanding a stage by tapping
2. Viewing the performer schedule
3. Switching between stages (auto-collapse)
4. Collapsing the active stage

## Project Structure

```
app/
├── src/
│   └── main/
│       ├── java/com/example/thefestivalminichallenge1/
│       │   ├── data/           # Data layer (repositories)
│       │   ├── domain/         # Domain layer
│       │   │   ├── model/      # Domain models (e.g., Stage, Performer)
│       │   │   └── usecase/    # Business logic (use cases)
│       │   └── presenter/      # UI layer (ViewModel, UI models, etc.)
│       └── res/               # Android resources
doc/                          # Documentation and demo materials
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

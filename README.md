  # Lecture Hall Reservation System

This document provides an in-depth overview of the **Lecture Hall Reservation System**, an Android application designed to streamline lecture hall bookings, user authentication, and scheduling management. The application leverages modern Android development tools to ensure an intuitive and responsive user experience.

## Features and Technologies Used

### 1. **User Authentication**

- **Definition**: Users can securely log in and register to book lecture halls.
- **Usage**: Implements Firebase Authentication to handle user sign-ups and logins, ensuring data security.

### 2. **Dashboard**

- **Definition**: Displays today's schedule with real-time updates.
- **Usage**:
  - Users can filter lecture halls by department or availability.
  - Lecture schedules are retrieved from Firebase Realtime Database.

### 3. **Lecture Hall Reservation**

- **Definition**: Users can check availability and book lecture halls.
- **Usage**:
  - Users select a hall and time slot.
  - Reservations are stored in Firebase with validation to prevent double bookings.

### 4. **Notifications**

- **Definition**: Alerts for upcoming reservations and schedule changes.
- **Usage**:
  - Uses Firebase Cloud Messaging (FCM) to send push notifications.
  - Ensures users receive timely reminders.

### 5. **Bottom Navigation Bar**

- **Definition**: Quick access to home, schedule, and settings.
- **Usage**:
  - Utilizes `BottomNavigationView` in Android.
  - Icons provide seamless navigation between sections.

### 6. **Database Management**

- **Definition**: Firebase Realtime Database stores and manages reservations.
- **Usage**:
  - Structured JSON data for fast queries.
  - Ensures real-time updates and synchronization.

### 7. **Error Handling**

- **Definition**: Prevents crashes and improves user experience.
- **Usage**:
  - Implements `try-catch` blocks in database transactions.
  - Provides user-friendly error messages.

### 8. **UI Design and Responsiveness**

- **Definition**: Ensures a consistent UI across devices.
- **Usage**:
  - Uses `ConstraintLayout` for adaptive UI.
  - Ensures proper spacing and alignment.

## Folder Structure
```
Lecture_Hall_Reservation_System/
│-- app/
│   │-- src/
│   │   │-- main/
│   │   │   │-- java/com/example/lacture_hall_reservation_system/
│   │   │   │   │-- DashboardActivity.java
│   │   │   │   │-- LoginActivity.java
│   │   │   │   │-- RegisterActivity.java
│   │   │   │   │-- ScheduleAdapter.java
│   │   │   │-- res/
│   │   │   │   │-- layout/
│   │   │   │   │   │-- activity_dashboard.xml
│   │   │   │   │   │-- schedule_card.xml
│   │   │   │   │-- drawable/
│   │   │   │   │-- values/
│-- build.gradle.kts
│-- README.md
```

## UI Screens
Below are the main UI screens of the application:
 <img src="https://i.postimg.cc/kgjNGrBJ/UI-Image.png" alt="tensorflow"  width="100%" height="100%"/>

## Authentication Flow
- **Firebase Authentication**: Handles secure login and registration.
- **Session Management**: Uses `SharedPreferences` to store session data.

## Known Issues & Fixes
- **UI Not Responsive:** Ensure `ConstraintLayout` is used instead of `LinearLayout`.
- **Navigation Bar Overlaps System Buttons:** Add `android:layout_marginBottom="16dp"` to fix.

## Future Enhancements
- Implement an admin panel for better lecture hall management.
- Add user profile management.
- Integrate push notifications for schedule changes.

## Contributors
- **Dulaj Hansana** - Developer

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.



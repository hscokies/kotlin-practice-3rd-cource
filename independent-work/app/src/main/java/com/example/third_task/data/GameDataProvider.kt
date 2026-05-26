package com.example.third_task.data

import com.example.first_task.R
import com.example.third_task.model.Game

object GameItemsProvider {
    fun Item(): Game {
        return Game(
            id = 1,
            name = "ARC Raiders",
            description = "ARC Raiders – анонсированная многопользовательская игра жанра extraction adventure, действие которой разворачивается в суровом будущем на Земле, атакованной загадочными механическими захватчиками ARC.",
            releaseDate = "30 октября 2025",
            developer = "Embark Studio",
            gameImage = R.drawable.arcriders,
            genres = "Экшн, Мультиплеер, Шутер, Научная фантастика",
            price = 3220
        )
    }

    fun Items(): List<Game> {
        return listOf(
            Game(
                id = 1,
                name = "ARC Raiders",
                description = "ARC Raiders – анонсированная многопользовательская игра жанра extraction adventure, действие которой разворачивается в суровом будущем на Земле, атакованной загадочными механическими захватчиками ARC.",
                releaseDate = "30 октября 2025",
                developer = "Embark Studio",
                gameImage = R.drawable.arcriders,
                genres = "Экшн, Мультиплеер, Шутер, Научная фантастика",
                price = 3220
            ),
            Game(
                id = 2,
                name = "Clair Obscur: Expedition 33",
                description = "Возглавьте Экспедицию 33 и уничтожьте Художницу, чтобы она никогда больше не смогла нарисовать смерть. Исследуйте мир чудес, созданный на основе Прекрасной эпохи Франции, и побеждайте уникальных врагов в пошаговой ролевой игре с механикой реального времени.",
                releaseDate = "24 апреля 2025",
                developer = "Sandfall Interactive",
                gameImage = R.drawable.expedition33,
                genres = "Ролевая, Пошаговая, Тактика, Фэнтези, Одиночная",
                price = 3499
            ),
            Game(
                id = 3,
                name = "Path of Exile 2",
                description = "Path of Exile 2 – это бесплатная Action RPG следующего поколения от Grinding Gear Games, с совместным режимом до шести игроков. Спустя годы после событий оригинальной Path of Exile, вы возвратитесь в мрачный мир Рэкласта и будете искать способ положить конец разрастающейся порче.",
                releaseDate = "6 декабря 2024",
                developer = "Grinding Gear Games",
                gameImage = R.drawable.pathofexile2,
                genres = "Экшн, ММО, Ролевая, Сверху/Изометрия",
                price = 1440,
            ),
            Game(
                id = 4,
                name = "ARC Raiders",
                description = "ARC Raiders – анонсированная многопользовательская игра жанра extraction adventure, действие которой разворачивается в суровом будущем на Земле, атакованной загадочными механическими захватчиками ARC.",
                releaseDate = "30 октября 2025",
                developer = "Embark Studio",
                gameImage = R.drawable.arcriders,
                genres = "Экшн, Мультиплеер, Шутер, Научная фантастика",
                price = 3220
            ),
            Game(
                id = 5,
                name = "Clair Obscur: Expedition 33",
                description = "Возглавьте Экспедицию 33 и уничтожьте Художницу, чтобы она никогда больше не смогла нарисовать смерть. Исследуйте мир чудес, созданный на основе Прекрасной эпохи Франции, и побеждайте уникальных врагов в пошаговой ролевой игре с механикой реального времени.",
                releaseDate = "24 апреля 2025",
                developer = "Sandfall Interactive",
                gameImage = R.drawable.expedition33,
                genres = "Ролевая, Пошаговая, Тактика, Фэнтези, Одиночная",
                price = 3499
            ),
            Game(
                id = 6,
                name = "Path of Exile 2",
                description = "Path of Exile 2 – это бесплатная Action RPG следующего поколения от Grinding Gear Games, с совместным режимом до шести игроков. Спустя годы после событий оригинальной Path of Exile, вы возвратитесь в мрачный мир Рэкласта и будете искать способ положить конец разрастающейся порче.",
                releaseDate = "6 декабря 2024",
                developer = "Grinding Gear Games",
                gameImage = R.drawable.pathofexile2,
                genres = "Экшн, ММО, Ролевая, Сверху/Изометрия",
                price = 1440,
            ),
            Game(
                id = 7,
                name = "ARC Raiders",
                description = "ARC Raiders – анонсированная многопользовательская игра жанра extraction adventure, действие которой разворачивается в суровом будущем на Земле, атакованной загадочными механическими захватчиками ARC.",
                releaseDate = "30 октября 2025",
                developer = "Embark Studio",
                gameImage = R.drawable.arcriders,
                genres = "Экшн, Мультиплеер, Шутер, Научная фантастика",
                price = 3220
            ),
            Game(
                id = 8,
                name = "Clair Obscur: Expedition 33",
                description = "Возглавьте Экспедицию 33 и уничтожьте Художницу, чтобы она никогда больше не смогла нарисовать смерть. Исследуйте мир чудес, созданный на основе Прекрасной эпохи Франции, и побеждайте уникальных врагов в пошаговой ролевой игре с механикой реального времени.",
                releaseDate = "24 апреля 2025",
                developer = "Sandfall Interactive",
                gameImage = R.drawable.expedition33,
                genres = "Ролевая, Пошаговая, Тактика, Фэнтези, Одиночная",
                price = 3499
            ),
            Game(
                id = 9,
                name = "Path of Exile 2",
                description = "Path of Exile 2 – это бесплатная Action RPG следующего поколения от Grinding Gear Games, с совместным режимом до шести игроков. Спустя годы после событий оригинальной Path of Exile, вы возвратитесь в мрачный мир Рэкласта и будете искать способ положить конец разрастающейся порче.",
                releaseDate = "6 декабря 2024",
                developer = "Grinding Gear Games",
                gameImage = R.drawable.pathofexile2,
                genres = "Экшн, ММО, Ролевая, Сверху/Изометрия",
                price = 1440,
            ),
            Game(
                id = 10,
                name = "ARC Raiders",
                description = "ARC Raiders – анонсированная многопользовательская игра жанра extraction adventure, действие которой разворачивается в суровом будущем на Земле, атакованной загадочными механическими захватчиками ARC.",
                releaseDate = "30 октября 2025",
                developer = "Embark Studio",
                gameImage = R.drawable.arcriders,
                genres = "Экшн, Мультиплеер, Шутер, Научная фантастика",
                price = 3220
            ),
            Game(
                id = 11,
                name = "Clair Obscur: Expedition 33",
                description = "Возглавьте Экспедицию 33 и уничтожьте Художницу, чтобы она никогда больше не смогла нарисовать смерть. Исследуйте мир чудес, созданный на основе Прекрасной эпохи Франции, и побеждайте уникальных врагов в пошаговой ролевой игре с механикой реального времени.",
                releaseDate = "24 апреля 2025",
                developer = "Sandfall Interactive",
                gameImage = R.drawable.expedition33,
                genres = "Ролевая, Пошаговая, Тактика, Фэнтези, Одиночная",
                price = 3499
            ),
            Game(
                id = 12,
                name = "Path of Exile 2",
                description = "Path of Exile 2 – это бесплатная Action RPG следующего поколения от Grinding Gear Games, с совместным режимом до шести игроков. Спустя годы после событий оригинальной Path of Exile, вы возвратитесь в мрачный мир Рэкласта и будете искать способ положить конец разрастающейся порче.",
                releaseDate = "6 декабря 2024",
                developer = "Grinding Gear Games",
                gameImage = R.drawable.pathofexile2,
                genres = "Экшн, ММО, Ролевая, Сверху/Изометрия",
                price = 1440,
            ),
            Game(
                id = 13,
                name = "ARC Raiders",
                description = "ARC Raiders – анонсированная многопользовательская игра жанра extraction adventure, действие которой разворачивается в суровом будущем на Земле, атакованной загадочными механическими захватчиками ARC.",
                releaseDate = "30 октября 2025",
                developer = "Embark Studio",
                gameImage = R.drawable.arcriders,
                genres = "Экшн, Мультиплеер, Шутер, Научная фантастика",
                price = 3220
            ),
            Game(
                id = 14,
                name = "Clair Obscur: Expedition 33",
                description = "Возглавьте Экспедицию 33 и уничтожьте Художницу, чтобы она никогда больше не смогла нарисовать смерть. Исследуйте мир чудес, созданный на основе Прекрасной эпохи Франции, и побеждайте уникальных врагов в пошаговой ролевой игре с механикой реального времени.",
                releaseDate = "24 апреля 2025",
                developer = "Sandfall Interactive",
                gameImage = R.drawable.expedition33,
                genres = "Ролевая, Пошаговая, Тактика, Фэнтези, Одиночная",
                price = 3499
            ),
            Game(
                id = 15,
                name = "Path of Exile 2",
                description = "Path of Exile 2 – это бесплатная Action RPG следующего поколения от Grinding Gear Games, с совместным режимом до шести игроков. Спустя годы после событий оригинальной Path of Exile, вы возвратитесь в мрачный мир Рэкласта и будете искать способ положить конец разрастающейся порче.",
                releaseDate = "6 декабря 2024",
                developer = "Grinding Gear Games",
                gameImage = R.drawable.pathofexile2,
                genres = "Экшн, ММО, Ролевая, Сверху/Изометрия",
                price = 1440,
            )
        )


    }
}
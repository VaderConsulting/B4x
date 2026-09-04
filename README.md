# B4x

Anywhere Software B4X additional libraries and a few tool projects (B4A, B4i, B4J, B4R, plus shared B4X libs) kept as Dave Robinson's working copy. The tree is organised as `B4X` / `B4a` / `B4i` / `B4j` / `B4r` each with `Libraries` and `Projects`. Includes `.b4xlib` packages such as B4XPages, XUI Views, OkHttpUtils2, and the `b4xlib2XML` B4J converter. Authorship of the libraries stays with Anywhere Software / the original library authors.

**Source last updated:** 2021-10-01  
**Language:** B4X / B4A / B4J / B4i / B4R  
**Target:** B4X IDEs (Anywhere Software)  
**Output:** libraries (`.b4xlib`) and B4J tool projects

## Solution structure

| Project | Language | Type | Purpose |
|---------|----------|------|---------|
| `B4X/Libraries` | B4X | library pack | Shared B4X libraries (`.b4xlib`, XUI Views, B4XPages, OkHttpUtils2, …) |
| `B4a/Libraries` | B4A | library pack | Android-side libraries and layouts |
| `B4i/Libraries` | B4i | library pack | iOS-side libraries |
| `B4j/Libraries` | B4J | library pack | Desktop/Java libraries |
| `B4r/Libraries` | B4R | library pack | Arduino/B4R libraries |
| `B4X/Projects/b4xlib2XML` | B4J | tool project | Convert `.b4xlib` to XML (`b4xlib2XML.b4j`) |
| `temp/` | B4X | scratch | Unpacked XUI Views / DragAndDrop2 sources |

## How to open

Open `B4X/Projects/b4xlib2XML/b4xlib2XML.b4j` (or the copy under `B4j/Projects`) in the B4J IDE. Copy `*/Libraries` into the corresponding B4X additional-libraries folder.

## Requirements

- B4X (B4A / B4J / B4i)

## Attribution and provenance

Working copy of B4X additional libraries from Dave Robinson's Historical Dev archive. Original B4X platform and many libraries are by Anywhere Software (Erel Uziel) and community authors. See `THIRD_PARTY_NOTICES.md`.

## License

Original B4X / Anywhere Software and community library licences apply. Dave's wrapper files in this repo, if any, are MIT © 2026 VaderConsulting. See `THIRD_PARTY_NOTICES.md`.

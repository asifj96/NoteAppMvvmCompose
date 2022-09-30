package com.asif.noteappmvvm.feature_note.domain.use_case

import com.asif.noteappmvvm.feature_note.domain.NoteRepository
import com.asif.noteappmvvm.feature_note.domain.model.InvalidNoteException
import com.asif.noteappmvvm.feature_note.domain.model.Note

class AddNote(
    private val noteRepository: NoteRepository
) {

    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {

        if (note.title.isBlank()) {
            throw InvalidNoteException("The title of note can't be empty.")
        }
        if (note.content.isBlank()) {
            throw InvalidNoteException("The title of content     can't be empty.")
        }
        noteRepository.insertNote(note)
    }
}
package com.asif.noteappmvvm.feature_note.domain.model

import com.asif.noteappmvvm.feature_note.domain.util.NoteOrder
import com.asif.noteappmvvm.feature_note.domain.util.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
) {
}
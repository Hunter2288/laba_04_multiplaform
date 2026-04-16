package com.example.laba_4.Shared.dialogs

import androidx.compose.runtime.Composable
import androidx.compose.ui.window.Dialog

@Composable
actual fun MeetingDialogWrapper(
    onDismiss: () -> Unit,
    content: @Composable (() -> Unit)
) {
    Dialog(onDismissRequest = onDismiss) {
        content()
    }
}
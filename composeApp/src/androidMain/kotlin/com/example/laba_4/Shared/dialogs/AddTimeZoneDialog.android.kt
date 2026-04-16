package com.example.laba_4.Shared.dialogs

import androidx.compose.runtime.Composable

@Composable
actual fun AddTimeDialogWrapper(
    onDismiss: () -> Unit,
    content: @Composable (() -> Unit)
) {
}
package com.example.todolist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/example/todolist/AddTodoActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/example/todolist/databinding/ActivityAddTodoBinding;", "isUpdate", "", "()Z", "setUpdate", "(Z)V", "oldTodo", "Lcom/example/todolist/models/Todo;", "todo", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class AddTodoActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.example.todolist.databinding.ActivityAddTodoBinding binding;
    private com.example.todolist.models.Todo todo;
    private com.example.todolist.models.Todo oldTodo;
    private boolean isUpdate = false;
    
    public AddTodoActivity() {
        super();
    }
    
    public final boolean isUpdate() {
        return false;
    }
    
    public final void setUpdate(boolean p0) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
}
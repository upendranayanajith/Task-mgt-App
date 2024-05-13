package com.example.todolist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\u0012\u0010\u001a\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014J\u0010\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001fH\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00100\u00100\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u00a8\u0006 "}, d2 = {"Lcom/example/todolist/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/example/todolist/adaptors/TodoAdapter$TodoClickListener;", "()V", "adapter", "Lcom/example/todolist/adaptors/TodoAdapter;", "getAdapter", "()Lcom/example/todolist/adaptors/TodoAdapter;", "setAdapter", "(Lcom/example/todolist/adaptors/TodoAdapter;)V", "binding", "Lcom/example/todolist/databinding/ActivityMainBinding;", "database", "Lcom/example/todolist/database/TodoDatabase;", "updateOrDeleteTodo", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "viewModel", "Lcom/example/todolist/models/TodoViewModel;", "getViewModel", "()Lcom/example/todolist/models/TodoViewModel;", "setViewModel", "(Lcom/example/todolist/models/TodoViewModel;)V", "initUI", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onItemClicked", "todo", "Lcom/example/todolist/models/Todo;", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity implements com.example.todolist.adaptors.TodoAdapter.TodoClickListener {
    private com.example.todolist.databinding.ActivityMainBinding binding;
    private com.example.todolist.database.TodoDatabase database;
    public com.example.todolist.models.TodoViewModel viewModel;
    public com.example.todolist.adaptors.TodoAdapter adapter;
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> updateOrDeleteTodo = null;
    
    public MainActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.todolist.models.TodoViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull
    com.example.todolist.models.TodoViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.todolist.adaptors.TodoAdapter getAdapter() {
        return null;
    }
    
    public final void setAdapter(@org.jetbrains.annotations.NotNull
    com.example.todolist.adaptors.TodoAdapter p0) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initUI() {
    }
    
    @java.lang.Override
    public void onItemClicked(@org.jetbrains.annotations.NotNull
    com.example.todolist.models.Todo todo) {
    }
}
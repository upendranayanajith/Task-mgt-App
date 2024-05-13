package com.example.todolist.adaptors;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u001a\u001bB\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\r\u001a\u00020\u000eH\u0016J\u001c\u0010\u000f\u001a\u00020\u00102\n\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\u001c\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000eH\u0016J\u0014\u0010\u0017\u001a\u00020\u00102\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\u0019R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/example/todolist/adaptors/TodoAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/todolist/adaptors/TodoAdapter$TodoViewHolder;", "context", "Landroid/content/Context;", "listener", "Lcom/example/todolist/adaptors/TodoAdapter$TodoClickListener;", "(Landroid/content/Context;Lcom/example/todolist/adaptors/TodoAdapter$TodoClickListener;)V", "getListener", "()Lcom/example/todolist/adaptors/TodoAdapter$TodoClickListener;", "todoList", "Ljava/util/ArrayList;", "Lcom/example/todolist/models/Todo;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateList", "newList", "", "TodoClickListener", "TodoViewHolder", "app_debug"})
public final class TodoAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.todolist.adaptors.TodoAdapter.TodoViewHolder> {
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.todolist.adaptors.TodoAdapter.TodoClickListener listener = null;
    private final java.util.ArrayList<com.example.todolist.models.Todo> todoList = null;
    
    public TodoAdapter(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    com.example.todolist.adaptors.TodoAdapter.TodoClickListener listener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.todolist.adaptors.TodoAdapter.TodoClickListener getListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.example.todolist.adaptors.TodoAdapter.TodoViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.example.todolist.adaptors.TodoAdapter.TodoViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    public final void updateList(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.todolist.models.Todo> newList) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0019\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0019\u0010\f\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR\u0019\u0010\u000e\u001a\n \u0007*\u0004\u0018\u00010\u000f0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0012"}, d2 = {"Lcom/example/todolist/adaptors/TodoAdapter$TodoViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/example/todolist/adaptors/TodoAdapter;Landroid/view/View;)V", "date", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "getDate", "()Landroid/widget/TextView;", "note", "getNote", "title", "getTitle", "todo_layout", "Landroidx/cardview/widget/CardView;", "getTodo_layout", "()Landroidx/cardview/widget/CardView;", "app_debug"})
    public final class TodoViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final androidx.cardview.widget.CardView todo_layout = null;
        private final android.widget.TextView title = null;
        private final android.widget.TextView note = null;
        private final android.widget.TextView date = null;
        
        public TodoViewHolder(@org.jetbrains.annotations.NotNull
        android.view.View itemView) {
            super(null);
        }
        
        public final androidx.cardview.widget.CardView getTodo_layout() {
            return null;
        }
        
        public final android.widget.TextView getTitle() {
            return null;
        }
        
        public final android.widget.TextView getNote() {
            return null;
        }
        
        public final android.widget.TextView getDate() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/todolist/adaptors/TodoAdapter$TodoClickListener;", "", "onItemClicked", "", "todo", "Lcom/example/todolist/models/Todo;", "app_debug"})
    public static abstract interface TodoClickListener {
        
        public abstract void onItemClicked(@org.jetbrains.annotations.NotNull
        com.example.todolist.models.Todo todo);
    }
}
// Generated by data binding compiler. Do not edit!
package com.example.todolist.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.todolist.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityAddTodoBinding extends ViewDataBinding {
  @NonNull
  public final EditText etNote;

  @NonNull
  public final EditText etTitle;

  @NonNull
  public final ImageView imgBackArrow;

  @NonNull
  public final ImageView imgCheck;

  @NonNull
  public final ImageView imgDelete;

  @NonNull
  public final Toolbar toolbar;

  protected ActivityAddTodoBinding(Object _bindingComponent, View _root, int _localFieldCount,
      EditText etNote, EditText etTitle, ImageView imgBackArrow, ImageView imgCheck,
      ImageView imgDelete, Toolbar toolbar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.etNote = etNote;
    this.etTitle = etTitle;
    this.imgBackArrow = imgBackArrow;
    this.imgCheck = imgCheck;
    this.imgDelete = imgDelete;
    this.toolbar = toolbar;
  }

  @NonNull
  public static ActivityAddTodoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_add_todo, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityAddTodoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityAddTodoBinding>inflateInternal(inflater, R.layout.activity_add_todo, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityAddTodoBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_add_todo, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityAddTodoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityAddTodoBinding>inflateInternal(inflater, R.layout.activity_add_todo, null, false, component);
  }

  public static ActivityAddTodoBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityAddTodoBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityAddTodoBinding)bind(component, view, R.layout.activity_add_todo);
  }
}

package com.tantanapp.beatles.safety.core;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.tantanapp.beatles.safety.component.SafetyTaskActivityProxy;
import com.tantanapp.beatles.safety.component.SafetyTaskServiceProxy;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public abstract class AbsSafetyPolicy implements Serializable {
    protected transient Context context;
    private final transient int mCrashCount;

    @Nullable
    protected transient Activity remoteActivity;
    protected Throwable throwable;

    public AbsSafetyPolicy(int i) {
        this.mCrashCount = i - 1;
    }

    private void startRemoteProcess() {
        Intent intent = new Intent();
        intent.putExtra("policy", this);
        boolean zRunInRemoteService = runInRemoteService();
        Context context = this.context;
        if (zRunInRemoteService) {
            intent.setClass(context, SafetyTaskServiceProxy.class);
            this.context.startService(intent);
        } else {
            intent.setClass(context, SafetyTaskActivityProxy.class);
            intent.addFlags(276856832);
            this.context.startActivity(intent);
        }
    }

    public final boolean execute(Context context, Throwable th) {
        boolean z;
        this.context = context;
        this.throwable = th;
        try {
            z = !localProcess();
        } catch (Exception unused) {
            z = true;
        }
        if (z) {
            startRemoteProcess();
        }
        return !z;
    }

    public int getCrashCount() {
        return this.mCrashCount;
    }

    public abstract boolean localProcess();

    public final void process(@Nullable AppCompatActivity appCompatActivity, Context context) {
        this.remoteActivity = appCompatActivity;
        this.context = context;
        remoteProcess();
    }

    public void remoteProcess() {
    }

    public boolean runInRemoteService() {
        return false;
    }
}

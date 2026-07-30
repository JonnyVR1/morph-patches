package com.immomo.baseutil;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.lang.ref.WeakReference;
import p149l.ii5;

/* JADX INFO: loaded from: classes7.dex */
public class HeadSetReceiver extends BroadcastReceiver {
    private static volatile HeadSetReceiver instance;
    private WeakReference<Context> mContextRef;
    private boolean mHeadSetOn = false;

    private IntentFilter getFilter() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.HEADSET_PLUG");
        return intentFilter;
    }

    public static HeadSetReceiver getInstance() {
        if (instance == null) {
            synchronized (HeadSetReceiver.class) {
                try {
                    if (instance == null) {
                        instance = new HeadSetReceiver();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return instance;
    }

    public boolean getHeadSetState() {
        return this.mHeadSetOn;
    }

    public synchronized void init(Context context) {
        if (this.mContextRef == null) {
            WeakReference<Context> weakReference = new WeakReference<>(context.getApplicationContext());
            this.mContextRef = weakReference;
            if (weakReference.get() != null) {
                ii5.m136342l(this.mContextRef.get(), this, getFilter());
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent != null && "android.intent.action.HEADSET_PLUG".equals(intent.getAction()) && intent.hasExtra("state")) {
            if (intent.getIntExtra("state", 0) == 0) {
                this.mHeadSetOn = false;
            } else if (intent.getIntExtra("state", 0) == 1) {
                this.mHeadSetOn = true;
            }
        }
    }

    public void uninit() {
        try {
            try {
                WeakReference<Context> weakReference = this.mContextRef;
                if (weakReference != null) {
                    if (weakReference.get() != null) {
                        this.mContextRef.get().unregisterReceiver(this);
                    }
                    this.mContextRef.clear();
                }
                this.mContextRef = null;
            } catch (IllegalArgumentException e) {
                if (!e.getMessage().contains("Receiver not registered")) {
                    throw e;
                }
                this.mContextRef = null;
            }
        } catch (Throwable th) {
            this.mContextRef = null;
            throw th;
        }
    }
}

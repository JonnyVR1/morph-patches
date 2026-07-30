package com.tencent.could.huiyansdk.utils;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.widget.TextView;
import com.tencent.could.huiyansdk.manager.C13905e;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: renamed from: com.tencent.could.huiyansdk.utils.h */
/* JADX INFO: loaded from: classes2.dex */
public class C13933h {

    /* JADX INFO: renamed from: a */
    public HandlerThread f57512a;

    /* JADX INFO: renamed from: b */
    public volatile Handler f57513b;

    /* JADX INFO: renamed from: c */
    public TextView f57514c;

    /* JADX INFO: renamed from: d */
    public String f57515d = "";

    /* JADX INFO: renamed from: e */
    public Queue<String> f57516e;

    public C13933h() {
        LinkedList linkedList = new LinkedList();
        this.f57516e = linkedList;
        linkedList.clear();
    }

    /* JADX INFO: renamed from: a */
    public final void m82406a() {
        if (this.f57514c != null && this.f57516e.size() > 0) {
            final String strPoll = this.f57516e.poll();
            this.f57514c.post(new Runnable() { // from class: l.vtq0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f182995a.m82405b(strPoll);
                }
            });
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m82408b() {
        if (this.f57513b == null) {
            return;
        }
        try {
            Message messageObtainMessage = this.f57513b.obtainMessage();
            messageObtainMessage.what = 1;
            this.f57513b.sendMessageDelayed(messageObtainMessage, 1000L);
        } catch (Exception e) {
            C13905e.a.f57445a.m82337a(2, "ShowTipsHelper", "failed to send wait extra tips event" + e.getLocalizedMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public void m82407a(String str) {
        if (this.f57515d.equals(str)) {
            return;
        }
        this.f57515d = str;
        this.f57514c.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public /* synthetic */ void m82405b(String str) {
        this.f57514c.setText(str);
    }
}

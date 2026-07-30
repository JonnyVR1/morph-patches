package com.tencent.could.huiyansdk.utils;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.widget.TextView;
import com.tencent.could.huiyansdk.manager.C14068e;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: renamed from: com.tencent.could.huiyansdk.utils.h */
/* JADX INFO: loaded from: classes12.dex */
public class C14096h {

    /* JADX INFO: renamed from: a */
    public HandlerThread f58360a;

    /* JADX INFO: renamed from: b */
    public volatile Handler f58361b;

    /* JADX INFO: renamed from: c */
    public TextView f58362c;

    /* JADX INFO: renamed from: d */
    public String f58363d = "";

    /* JADX INFO: renamed from: e */
    public Queue<String> f58364e;

    public C14096h() {
        LinkedList linkedList = new LinkedList();
        this.f58364e = linkedList;
        linkedList.clear();
    }

    /* JADX INFO: renamed from: a */
    public final void m83589a() {
        if (this.f58362c != null && this.f58364e.size() > 0) {
            final String strPoll = this.f58364e.poll();
            this.f58362c.post(new Runnable() { // from class: l.b3r0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f74807a.m83588b(strPoll);
                }
            });
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m83591b() {
        if (this.f58361b == null) {
            return;
        }
        try {
            Message messageObtainMessage = this.f58361b.obtainMessage();
            messageObtainMessage.what = 1;
            this.f58361b.sendMessageDelayed(messageObtainMessage, 1000L);
        } catch (Exception e) {
            C14068e.a.f58293a.m83520a(2, "ShowTipsHelper", "failed to send wait extra tips event" + e.getLocalizedMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public void m83590a(String str) {
        if (this.f58363d.equals(str)) {
            return;
        }
        this.f58363d = str;
        this.f58362c.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public /* synthetic */ void m83588b(String str) {
        this.f58362c.setText(str);
    }
}

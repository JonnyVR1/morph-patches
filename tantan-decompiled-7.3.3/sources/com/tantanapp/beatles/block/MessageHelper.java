package com.tantanapp.beatles.block;

import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.Keep;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import p153l.wgl;

/* JADX INFO: loaded from: classes11.dex */
public class MessageHelper {

    /* JADX INFO: renamed from: d */
    public static int f56737d = 100;

    /* JADX INFO: renamed from: e */
    public static int f56738e = 20;

    /* JADX INFO: renamed from: f */
    public static LinkedList<MessagesInfo> f56739f = new LinkedList<>();

    /* JADX INFO: renamed from: g */
    public static LinkedList<MessagesInfo> f56740g = new LinkedList<>();

    /* JADX INFO: renamed from: h */
    public static LinkedList<MessageStack> f56741h = new LinkedList<>();

    /* JADX INFO: renamed from: i */
    public static LinkedList<MessageStack> f56742i = new LinkedList<>();

    /* JADX INFO: renamed from: a */
    public int f56743a;

    /* JADX INFO: renamed from: b */
    public int f56744b;

    /* JADX INFO: renamed from: c */
    public int f56745c = 0;

    @Keep
    public static class MessageInfo implements Serializable {
        public int arg1;
        public int arg2;
        String callback;
        String target;
        public int what;
        public long when;
    }

    @Keep
    public static class MessageStack implements Serializable {
        private String stacktrace;
        private long startTime;

        public void reset() {
            this.startTime = 0L;
            this.stacktrace = "";
        }
    }

    @Keep
    public static class MessageUnit implements Serializable {
        public MessagesInfo current_message;
        public List<MessagesInfo> history_message = new LinkedList();
        public List<MessageInfo> pending_message = new LinkedList();
        public List<MessageStack> stacks = new LinkedList();
    }

    @Keep
    public static class MessagesInfo implements Serializable {
        public int count;
        public boolean isIdle;
        public MessageInfo msgInfo;
        public long cpuTime = -1;
        public long wallTime = 0;
        public long startTime = 0;

        public void reset() {
            this.cpuTime = -1L;
            this.wallTime = 0L;
            this.startTime = 0L;
            this.count = 0;
            this.msgInfo = null;
            this.isIdle = false;
        }
    }

    public MessageHelper(int i) {
        this.f56743a = i;
    }

    /* JADX INFO: renamed from: a */
    public void m82274a(long j, String str) {
        MessageStack messageStackM82284k = m82284k();
        messageStackM82284k.stacktrace = str;
        messageStackM82284k.startTime = j;
        MessageStack messageStackPeekLast = f56742i.peekLast();
        if (messageStackPeekLast != null && messageStackPeekLast.startTime == j) {
            MessageStack messageStackRemoveLast = f56742i.removeLast();
            messageStackRemoveLast.reset();
            f56741h.add(messageStackRemoveLast);
        }
        f56742i.add(messageStackM82284k);
        if (f56742i.size() > f56738e) {
            MessageStack messageStackPop = f56742i.pop();
            messageStackPop.reset();
            f56741h.add(messageStackPop);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m82275b(long j, long j2, long j3, Message message) {
        if (j3 == -1) {
            int i = this.f56743a;
            if (j2 >= i) {
                if (this.f56745c > 0) {
                    m82276c(j);
                }
                MessagesInfo messagesInfoM82283j = m82283j();
                messagesInfoM82283j.wallTime = this.f56744b;
                messagesInfoM82283j.count = 0;
                messagesInfoM82283j.isIdle = true;
                messagesInfoM82283j.startTime = j;
                f56739f.add(messagesInfoM82283j);
            } else {
                int i2 = (int) (((long) this.f56744b) + j2);
                this.f56744b = i2;
                this.f56745c++;
                if (i2 >= i) {
                    m82276c(j);
                }
            }
        } else {
            if (this.f56745c > 0) {
                m82276c(j);
            }
            if (message != null) {
                MessagesInfo messagesInfoM82283j2 = m82283j();
                messagesInfoM82283j2.msgInfo = m82279f(message);
                messagesInfoM82283j2.cpuTime = j3;
                messagesInfoM82283j2.wallTime = j2;
                messagesInfoM82283j2.startTime = j;
                messagesInfoM82283j2.count = 1;
                f56739f.add(messagesInfoM82283j2);
            }
        }
        if (f56739f.size() > f56737d) {
            MessagesInfo messagesInfoPop = f56739f.pop();
            messagesInfoPop.reset();
            f56740g.add(messagesInfoPop);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m82276c(long j) {
        MessagesInfo messagesInfoM82283j = m82283j();
        messagesInfoM82283j.wallTime = this.f56744b;
        messagesInfoM82283j.count = this.f56745c;
        messagesInfoM82283j.startTime = j;
        f56739f.add(messagesInfoM82283j);
        this.f56744b = 0;
        this.f56745c = 0;
    }

    /* JADX INFO: renamed from: d */
    public final MessagesInfo m82277d() {
        Message messageM206200e = wgl.m206200e();
        if (messageM206200e == null) {
            return null;
        }
        MessagesInfo messagesInfoM82283j = m82283j();
        messagesInfoM82283j.msgInfo = m82279f(messageM206200e);
        return messagesInfoM82283j;
    }

    /* JADX INFO: renamed from: e */
    public final List<MessagesInfo> m82278e() {
        return f56739f;
    }

    /* JADX INFO: renamed from: f */
    public final MessageInfo m82279f(Message message) {
        MessageInfo messageInfo = new MessageInfo();
        messageInfo.what = message.what;
        messageInfo.when = message.getWhen() - SystemClock.uptimeMillis();
        messageInfo.target = message.getTarget() != null ? message.getTarget().toString() : "";
        messageInfo.callback = message.getCallback() != null ? message.getCallback().toString() : "";
        messageInfo.arg1 = message.arg1;
        messageInfo.arg2 = message.arg2;
        return messageInfo;
    }

    /* JADX INFO: renamed from: g */
    public MessageUnit m82280g(long j) {
        MessageUnit messageUnit = new MessageUnit();
        List<MessagesInfo> listM82278e = m82278e();
        if (listM82278e.size() > 0) {
            messageUnit.history_message.addAll(listM82278e);
        }
        MessagesInfo messagesInfoM82277d = m82277d();
        if (messagesInfoM82277d != null) {
            messagesInfoM82277d.count = 1;
            messagesInfoM82277d.startTime = j;
            messagesInfoM82277d.wallTime = SystemClock.uptimeMillis() - j;
        }
        messageUnit.current_message = messagesInfoM82277d;
        List<MessageInfo> listM82282i = m82282i();
        if (listM82282i != null) {
            messageUnit.pending_message.addAll(listM82282i);
        }
        LinkedList<MessageStack> linkedList = f56742i;
        if (linkedList != null) {
            messageUnit.stacks.addAll(linkedList);
        }
        return messageUnit;
    }

    /* JADX INFO: renamed from: h */
    public int m82281h() {
        return this.f56743a;
    }

    /* JADX INFO: renamed from: i */
    public final List<MessageInfo> m82282i() {
        List<Message> listM206197b = wgl.m206197b();
        if (listM206197b == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        Iterator<Message> it = listM206197b.iterator();
        while (it.hasNext()) {
            linkedList.add(m82279f(it.next()));
        }
        return linkedList;
    }

    /* JADX INFO: renamed from: j */
    public final MessagesInfo m82283j() {
        return !f56740g.isEmpty() ? f56740g.pop() : new MessagesInfo();
    }

    /* JADX INFO: renamed from: k */
    public final MessageStack m82284k() {
        return !f56741h.isEmpty() ? f56741h.pop() : new MessageStack();
    }
}

package com.tantanapp.beatles.block;

import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.Keep;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import p149l.gel;

/* JADX INFO: loaded from: classes13.dex */
public class MessageHelper {

    /* JADX INFO: renamed from: d */
    public static int f55889d = 100;

    /* JADX INFO: renamed from: e */
    public static int f55890e = 20;

    /* JADX INFO: renamed from: f */
    public static LinkedList<MessagesInfo> f55891f = new LinkedList<>();

    /* JADX INFO: renamed from: g */
    public static LinkedList<MessagesInfo> f55892g = new LinkedList<>();

    /* JADX INFO: renamed from: h */
    public static LinkedList<MessageStack> f55893h = new LinkedList<>();

    /* JADX INFO: renamed from: i */
    public static LinkedList<MessageStack> f55894i = new LinkedList<>();

    /* JADX INFO: renamed from: a */
    public int f55895a;

    /* JADX INFO: renamed from: b */
    public int f55896b;

    /* JADX INFO: renamed from: c */
    public int f55897c = 0;

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
        this.f55895a = i;
    }

    /* JADX INFO: renamed from: a */
    public void m81091a(long j, String str) {
        MessageStack messageStackM81101k = m81101k();
        messageStackM81101k.stacktrace = str;
        messageStackM81101k.startTime = j;
        MessageStack messageStackPeekLast = f55894i.peekLast();
        if (messageStackPeekLast != null && messageStackPeekLast.startTime == j) {
            MessageStack messageStackRemoveLast = f55894i.removeLast();
            messageStackRemoveLast.reset();
            f55893h.add(messageStackRemoveLast);
        }
        f55894i.add(messageStackM81101k);
        if (f55894i.size() > f55890e) {
            MessageStack messageStackPop = f55894i.pop();
            messageStackPop.reset();
            f55893h.add(messageStackPop);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m81092b(long j, long j2, long j3, Message message) {
        if (j3 == -1) {
            int i = this.f55895a;
            if (j2 >= i) {
                if (this.f55897c > 0) {
                    m81093c(j);
                }
                MessagesInfo messagesInfoM81100j = m81100j();
                messagesInfoM81100j.wallTime = this.f55896b;
                messagesInfoM81100j.count = 0;
                messagesInfoM81100j.isIdle = true;
                messagesInfoM81100j.startTime = j;
                f55891f.add(messagesInfoM81100j);
            } else {
                int i2 = (int) (((long) this.f55896b) + j2);
                this.f55896b = i2;
                this.f55897c++;
                if (i2 >= i) {
                    m81093c(j);
                }
            }
        } else {
            if (this.f55897c > 0) {
                m81093c(j);
            }
            if (message != null) {
                MessagesInfo messagesInfoM81100j2 = m81100j();
                messagesInfoM81100j2.msgInfo = m81096f(message);
                messagesInfoM81100j2.cpuTime = j3;
                messagesInfoM81100j2.wallTime = j2;
                messagesInfoM81100j2.startTime = j;
                messagesInfoM81100j2.count = 1;
                f55891f.add(messagesInfoM81100j2);
            }
        }
        if (f55891f.size() > f55889d) {
            MessagesInfo messagesInfoPop = f55891f.pop();
            messagesInfoPop.reset();
            f55892g.add(messagesInfoPop);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m81093c(long j) {
        MessagesInfo messagesInfoM81100j = m81100j();
        messagesInfoM81100j.wallTime = this.f55896b;
        messagesInfoM81100j.count = this.f55897c;
        messagesInfoM81100j.startTime = j;
        f55891f.add(messagesInfoM81100j);
        this.f55896b = 0;
        this.f55897c = 0;
    }

    /* JADX INFO: renamed from: d */
    public final MessagesInfo m81094d() {
        Message messageM125824e = gel.m125824e();
        if (messageM125824e == null) {
            return null;
        }
        MessagesInfo messagesInfoM81100j = m81100j();
        messagesInfoM81100j.msgInfo = m81096f(messageM125824e);
        return messagesInfoM81100j;
    }

    /* JADX INFO: renamed from: e */
    public final List<MessagesInfo> m81095e() {
        return f55891f;
    }

    /* JADX INFO: renamed from: f */
    public final MessageInfo m81096f(Message message) {
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
    public MessageUnit m81097g(long j) {
        MessageUnit messageUnit = new MessageUnit();
        List<MessagesInfo> listM81095e = m81095e();
        if (listM81095e.size() > 0) {
            messageUnit.history_message.addAll(listM81095e);
        }
        MessagesInfo messagesInfoM81094d = m81094d();
        if (messagesInfoM81094d != null) {
            messagesInfoM81094d.count = 1;
            messagesInfoM81094d.startTime = j;
            messagesInfoM81094d.wallTime = SystemClock.uptimeMillis() - j;
        }
        messageUnit.current_message = messagesInfoM81094d;
        List<MessageInfo> listM81099i = m81099i();
        if (listM81099i != null) {
            messageUnit.pending_message.addAll(listM81099i);
        }
        LinkedList<MessageStack> linkedList = f55894i;
        if (linkedList != null) {
            messageUnit.stacks.addAll(linkedList);
        }
        return messageUnit;
    }

    /* JADX INFO: renamed from: h */
    public int m81098h() {
        return this.f55895a;
    }

    /* JADX INFO: renamed from: i */
    public final List<MessageInfo> m81099i() {
        List<Message> listM125821b = gel.m125821b();
        if (listM125821b == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        Iterator<Message> it = listM125821b.iterator();
        while (it.hasNext()) {
            linkedList.add(m81096f(it.next()));
        }
        return linkedList;
    }

    /* JADX INFO: renamed from: j */
    public final MessagesInfo m81100j() {
        return !f55892g.isEmpty() ? f55892g.pop() : new MessagesInfo();
    }

    /* JADX INFO: renamed from: k */
    public final MessageStack m81101k() {
        return !f55893h.isEmpty() ? f55893h.pop() : new MessageStack();
    }
}

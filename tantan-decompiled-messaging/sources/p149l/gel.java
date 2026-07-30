package p149l;

import android.os.Handler;
import android.os.Message;
import android.os.MessageQueue;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class gel {

    /* JADX INFO: renamed from: a */
    public static Handler f102271a;

    /* JADX INFO: renamed from: b */
    public static MessageQueue f102272b;

    /* JADX INFO: renamed from: a */
    public static Message m125820a(Message message) {
        try {
            Field declaredField = Class.forName("android.os.Message").getDeclaredField("next");
            declaredField.setAccessible(true);
            return (Message) declaredField.get(message);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static List<Message> m125821b() {
        Message messageM125824e = m125824e();
        if (messageM125824e == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        while (messageM125824e != null) {
            messageM125824e = m125820a(messageM125824e);
            arrayList.add(messageM125824e);
            if (arrayList.size() >= 10) {
                return arrayList;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static Handler m125822c() {
        Handler handler = f102271a;
        if (handler == null) {
            handler = null;
            try {
                Class<?> cls = Class.forName("android.app.ActivityThread");
                Object objInvoke = cls.getDeclaredMethod("currentActivityThread", null).invoke(null, null);
                Field declaredField = cls.getDeclaredField("mH");
                declaredField.setAccessible(true);
                Handler handler2 = (Handler) declaredField.get(objInvoke);
                f102271a = handler2;
                return handler2;
            } catch (Exception unused) {
            }
        }
        return handler;
    }

    /* JADX INFO: renamed from: d */
    public static MessageQueue m125823d(Handler handler) {
        if (handler == null) {
            return null;
        }
        MessageQueue messageQueue = f102272b;
        if (messageQueue != null) {
            return messageQueue;
        }
        try {
            Field declaredField = Class.forName("android.os.Handler").getDeclaredField("mQueue");
            declaredField.setAccessible(true);
            MessageQueue messageQueue2 = (MessageQueue) declaredField.get(handler);
            f102272b = messageQueue2;
            return messageQueue2;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static Message m125824e() {
        m125823d(m125822c());
        if (f102272b == null) {
            return null;
        }
        try {
            Field declaredField = Class.forName("android.os.MessageQueue").getDeclaredField("mMessages");
            declaredField.setAccessible(true);
            return (Message) declaredField.get(f102272b);
        } catch (Exception unused) {
            return null;
        }
    }
}

package p153l;

import android.os.Handler;
import android.os.Message;
import android.os.MessageQueue;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class wgl {

    /* JADX INFO: renamed from: a */
    public static Handler f188985a;

    /* JADX INFO: renamed from: b */
    public static MessageQueue f188986b;

    /* JADX INFO: renamed from: a */
    public static Message m206196a(Message message) {
        try {
            Field declaredField = Class.forName("android.os.Message").getDeclaredField("next");
            declaredField.setAccessible(true);
            return (Message) declaredField.get(message);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static List<Message> m206197b() {
        Message messageM206200e = m206200e();
        if (messageM206200e == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        while (messageM206200e != null) {
            messageM206200e = m206196a(messageM206200e);
            arrayList.add(messageM206200e);
            if (arrayList.size() >= 10) {
                return arrayList;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static Handler m206198c() {
        Handler handler = f188985a;
        if (handler == null) {
            handler = null;
            try {
                Class<?> cls = Class.forName("android.app.ActivityThread");
                Object objInvoke = cls.getDeclaredMethod("currentActivityThread", null).invoke(null, null);
                Field declaredField = cls.getDeclaredField("mH");
                declaredField.setAccessible(true);
                Handler handler2 = (Handler) declaredField.get(objInvoke);
                f188985a = handler2;
                return handler2;
            } catch (Exception unused) {
            }
        }
        return handler;
    }

    /* JADX INFO: renamed from: d */
    public static MessageQueue m206199d(Handler handler) {
        if (handler == null) {
            return null;
        }
        MessageQueue messageQueue = f188986b;
        if (messageQueue != null) {
            return messageQueue;
        }
        try {
            Field declaredField = Class.forName("android.os.Handler").getDeclaredField("mQueue");
            declaredField.setAccessible(true);
            MessageQueue messageQueue2 = (MessageQueue) declaredField.get(handler);
            f188986b = messageQueue2;
            return messageQueue2;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static Message m206200e() {
        m206199d(m206198c());
        if (f188986b == null) {
            return null;
        }
        try {
            Field declaredField = Class.forName("android.os.MessageQueue").getDeclaredField("mMessages");
            declaredField.setAccessible(true);
            return (Message) declaredField.get(f188986b);
        } catch (Exception unused) {
            return null;
        }
    }
}

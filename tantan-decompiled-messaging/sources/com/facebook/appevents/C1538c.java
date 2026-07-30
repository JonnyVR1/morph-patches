package com.facebook.appevents;

import android.content.Context;
import com.facebook.C1577c;
import com.facebook.internal.C1657e;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.nv0;

/* JADX INFO: renamed from: com.facebook.appevents.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0001¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u000e\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\r¨\u0006\u000f"}, m87232d2 = {"Lcom/facebook/appevents/c;", "", "<init>", "()V", "Lcom/facebook/appevents/PersistedEvents;", "a", "()Lcom/facebook/appevents/PersistedEvents;", "eventsToPersist", "", "b", "(Lcom/facebook/appevents/PersistedEvents;)V", "", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "TAG", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class C1538c {

    @NotNull
    public static final C1538c INSTANCE = new C1538c();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final String TAG = C1538c.class.getName();

    /* JADX INFO: renamed from: com.facebook.appevents.c$a */
    @Metadata(m87231d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\nB\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m87232d2 = {"Lcom/facebook/appevents/c$a;", "Ljava/io/ObjectInputStream;", "Ljava/io/InputStream;", "inputStream", "<init>", "(Ljava/io/InputStream;)V", "Ljava/io/ObjectStreamClass;", "readClassDescriptor", "()Ljava/io/ObjectStreamClass;", "Companion", "a", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class a extends ObjectInputStream {
        public a(@Nullable InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.ObjectInputStream
        @NotNull
        public ObjectStreamClass readClassDescriptor() throws ClassNotFoundException, IOException {
            ObjectStreamClass classDescriptor = super.readClassDescriptor();
            if (Intrinsics.m87488d(classDescriptor.getName(), "com.facebook.appevents.AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1")) {
                classDescriptor = ObjectStreamClass.lookup(AccessTokenAppIdPair.SerializationProxyV1.class);
            } else if (Intrinsics.m87488d(classDescriptor.getName(), "com.facebook.appevents.AppEventsLogger$AppEvent$SerializationProxyV2")) {
                classDescriptor = ObjectStreamClass.lookup(AppEvent.SerializationProxyV2.class);
            }
            classDescriptor.getClass();
            return classDescriptor;
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final synchronized PersistedEvents m7664a() {
        PersistedEvents persistedEvents;
        a aVar;
        Throwable th;
        String str;
        nv0.m161519b();
        Context contextM8047l = C1577c.m8047l();
        persistedEvents = null;
        try {
            FileInputStream fileInputStreamOpenFileInput = contextM8047l.openFileInput("AppEventsLogger.persistedevents");
            fileInputStreamOpenFileInput.getClass();
            aVar = new a(new BufferedInputStream(fileInputStreamOpenFileInput));
            try {
                Object object = aVar.readObject();
                object.getClass();
                PersistedEvents persistedEvents2 = (PersistedEvents) object;
                C1657e.m8843j(aVar);
                try {
                    contextM8047l.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                } catch (Exception unused) {
                }
                persistedEvents = persistedEvents2;
            } catch (FileNotFoundException unused2) {
                C1657e.m8843j(aVar);
                str = "AppEventsLogger.persistedevents";
                try {
                    contextM8047l.getFileStreamPath(str).delete();
                } catch (Exception unused3) {
                }
            } catch (Exception unused4) {
                C1657e.m8843j(aVar);
                str = "AppEventsLogger.persistedevents";
                contextM8047l.getFileStreamPath(str).delete();
            } catch (Throwable th2) {
                th = th2;
                C1657e.m8843j(aVar);
                try {
                    contextM8047l.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                } catch (Exception unused5) {
                }
                throw th;
            }
        } catch (FileNotFoundException unused6) {
            aVar = null;
        } catch (Exception unused7) {
            aVar = null;
        } catch (Throwable th3) {
            aVar = null;
            th = th3;
        }
        if (persistedEvents == null) {
            persistedEvents = new PersistedEvents();
        }
        return persistedEvents;
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final void m7665b(@Nullable PersistedEvents eventsToPersist) {
        Context contextM8047l = C1577c.m8047l();
        ObjectOutputStream objectOutputStream = null;
        try {
            ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(new BufferedOutputStream(contextM8047l.openFileOutput("AppEventsLogger.persistedevents", 0)));
            try {
                objectOutputStream2.writeObject(eventsToPersist);
                C1657e.m8843j(objectOutputStream2);
            } catch (Throwable unused) {
                objectOutputStream = objectOutputStream2;
                try {
                    contextM8047l.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                } catch (Exception unused2) {
                } finally {
                    C1657e.m8843j(objectOutputStream);
                }
            }
        } catch (Throwable unused3) {
        }
    }
}

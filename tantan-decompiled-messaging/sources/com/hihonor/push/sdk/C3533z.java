package com.hihonor.push.sdk;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.hihonor.push.framework.aidl.DataBuffer;
import com.hihonor.push.framework.aidl.IMessageEntity;
import com.hihonor.push.framework.aidl.IPushInvoke;
import com.hihonor.push.framework.aidl.MessageCodec;
import com.hihonor.push.framework.aidl.entity.RequestHeader;
import com.hihonor.push.sdk.bean.RemoteServiceBean;
import com.hihonor.push.sdk.internal.HonorPushErrorEnum;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.hihonor.push.sdk.z */
/* JADX INFO: loaded from: classes7.dex */
public class C3533z implements Handler.Callback {

    /* JADX INFO: renamed from: c */
    public static final C3533z f11948c = new C3533z();

    /* JADX INFO: renamed from: a */
    public final Handler f11949a;

    /* JADX INFO: renamed from: b */
    public final Map<C3527w, a> f11950b = new ConcurrentHashMap(5, 0.75f, 1);

    /* JADX INFO: renamed from: com.hihonor.push.sdk.z$b */
    public static class b implements InterfaceC3500i0 {

        /* JADX INFO: renamed from: a */
        public AbstractC3492f1<?> f11957a;

        public b(AbstractC3492f1<?> abstractC3492f1) {
            this.f11957a = abstractC3492f1;
        }
    }

    public C3533z() {
        HandlerThread handlerThread = new HandlerThread("HonorApiManager");
        handlerThread.start();
        this.f11949a = new Handler(handlerThread.getLooper(), this);
    }

    /* JADX INFO: renamed from: a */
    public C3476a1 m17530a(AbstractC3492f1 abstractC3492f1) {
        C3510n0<TResult> c3510n0 = new C3510n0<>();
        abstractC3492f1.f11867a = c3510n0;
        Handler handler = this.f11949a;
        handler.sendMessage(handler.obtainMessage(1, abstractC3492f1));
        return c3510n0.f11901a;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        a aVar;
        int i = message.what;
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            AbstractC3492f1 abstractC3492f1 = (AbstractC3492f1) message.obj;
            C3527w c3527w = abstractC3492f1.f11870d;
            if (c3527w != null && this.f11950b.containsKey(c3527w) && (aVar = this.f11950b.get(c3527w)) != null) {
                synchronized (aVar) {
                    try {
                        aVar.f11952b.remove(abstractC3492f1);
                        if (aVar.f11951a.peek() == null || aVar.f11952b.peek() == null) {
                            aVar.m17531a();
                            C3533z.this.f11950b.remove(aVar.f11955e);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return true;
        }
        AbstractC3492f1<?> abstractC3492f2 = (AbstractC3492f1) message.obj;
        C3527w c3527w2 = abstractC3492f2.f11870d;
        a aVar2 = this.f11950b.get(c3527w2);
        if (aVar2 == null) {
            aVar2 = new a(c3527w2);
            this.f11950b.put(c3527w2, aVar2);
        }
        synchronized (aVar2) {
            try {
                C3477b.m17493a(C3533z.this.f11949a);
                if (((C3485d0) aVar2.f11953c).m17510a()) {
                    aVar2.m17532a(abstractC3492f2);
                } else {
                    aVar2.f11951a.add(abstractC3492f2);
                    HonorPushErrorEnum honorPushErrorEnum = aVar2.f11954d;
                    if (honorPushErrorEnum == null || honorPushErrorEnum.getErrorCode() == 0) {
                        synchronized (aVar2) {
                            try {
                                C3477b.m17493a(C3533z.this.f11949a);
                                if (!((C3485d0) aVar2.f11953c).m17510a() && ((C3485d0) aVar2.f11953c).f11852a.get() != 5) {
                                    C3485d0 c3485d0 = (C3485d0) aVar2.f11953c;
                                    c3485d0.getClass();
                                    int i2 = c3485d0.f11852a.get();
                                    if (i2 != 3 && i2 != 5 && i2 != 4) {
                                        C3505l c3505l = C3505l.f11890e;
                                        int iM17498b = C3477b.m17498b(c3505l.m17520a());
                                        if (iM17498b == HonorPushErrorEnum.SUCCESS.getErrorCode()) {
                                            c3485d0.f11852a.set(5);
                                            RemoteServiceBean remoteServiceBeanM17488a = C3477b.m17488a(c3505l.m17520a());
                                            ServiceConnectionC3491f0 serviceConnectionC3491f0 = new ServiceConnectionC3491f0(remoteServiceBeanM17488a);
                                            c3485d0.f11855d = serviceConnectionC3491f0;
                                            serviceConnectionC3491f0.f11864b = new C3481c0(c3485d0);
                                            if (remoteServiceBeanM17488a.checkServiceInfo()) {
                                                Intent intent = new Intent();
                                                String packageName = serviceConnectionC3491f0.f11863a.getPackageName();
                                                String packageAction = serviceConnectionC3491f0.f11863a.getPackageAction();
                                                String packageServiceName = serviceConnectionC3491f0.f11863a.getPackageServiceName();
                                                if (TextUtils.isEmpty(packageServiceName)) {
                                                    intent.setAction(packageAction);
                                                    intent.setPackage(packageName);
                                                } else {
                                                    intent.setComponent(new ComponentName(packageName, packageServiceName));
                                                }
                                                synchronized (ServiceConnectionC3491f0.f11862e) {
                                                    try {
                                                        if (c3505l.m17520a().bindService(intent, serviceConnectionC3491f0, 1)) {
                                                            Handler handler = serviceConnectionC3491f0.f11865c;
                                                            if (handler != null) {
                                                                handler.removeMessages(1001);
                                                            } else {
                                                                serviceConnectionC3491f0.f11865c = new Handler(Looper.getMainLooper(), new C3488e0(serviceConnectionC3491f0));
                                                            }
                                                            serviceConnectionC3491f0.f11865c.sendEmptyMessageDelayed(1001, 10000L);
                                                        } else {
                                                            serviceConnectionC3491f0.f11866d = true;
                                                            serviceConnectionC3491f0.m17512a(8002001);
                                                        }
                                                    } catch (Throwable th2) {
                                                        throw th2;
                                                    }
                                                }
                                            } else {
                                                Objects.toString(serviceConnectionC3491f0.f11863a);
                                                serviceConnectionC3491f0.m17512a(8002004);
                                            }
                                        } else {
                                            c3485d0.m17509a(iM17498b);
                                        }
                                    }
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    } else {
                        aVar2.m17533a(aVar2.f11954d);
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: com.hihonor.push.sdk.z$a */
    public class a implements InterfaceC3478b0.a {

        /* JADX INFO: renamed from: a */
        public final Queue<AbstractC3492f1<?>> f11951a = new LinkedList();

        /* JADX INFO: renamed from: b */
        public final Queue<AbstractC3492f1<?>> f11952b = new LinkedList();

        /* JADX INFO: renamed from: c */
        public final InterfaceC3478b0 f11953c = new C3485d0(this);

        /* JADX INFO: renamed from: d */
        public HonorPushErrorEnum f11954d = null;

        /* JADX INFO: renamed from: e */
        public final C3527w f11955e;

        public a(C3527w c3527w) {
            this.f11955e = c3527w;
        }

        /* JADX INFO: renamed from: a */
        public final synchronized void m17532a(AbstractC3492f1<?> abstractC3492f1) {
            Type type;
            try {
                this.f11952b.add(abstractC3492f1);
                InterfaceC3478b0 interfaceC3478b0 = this.f11953c;
                b bVar = new b(abstractC3492f1);
                abstractC3492f1.getClass();
                Object objNewInstance = null;
                try {
                    Type genericSuperclass = abstractC3492f1.getClass().getGenericSuperclass();
                    Class cls = (genericSuperclass == null || (type = ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]) == null) ? null : (Class) type;
                    if (cls != null && !cls.isPrimitive()) {
                        objNewInstance = cls.newInstance();
                    }
                } catch (Exception e) {
                    C3480c.m17503a("In newResponseInstance, instancing exception." + e.getMessage());
                }
                BinderC3497h0 binderC3497h0 = new BinderC3497h0(objNewInstance, bVar);
                IPushInvoke iPushInvoke = ((C3485d0) interfaceC3478b0).f11853b;
                String str = abstractC3492f1.f11868b;
                RequestHeader requestHeader = abstractC3492f1.f11871e;
                IMessageEntity iMessageEntity = abstractC3492f1.f11869c;
                Bundle bundle = new Bundle();
                Bundle bundle2 = new Bundle();
                MessageCodec.formMessageEntity(requestHeader, bundle);
                MessageCodec.formMessageEntity(iMessageEntity, bundle2);
                DataBuffer dataBuffer = new DataBuffer(str, bundle, bundle2);
                if (iPushInvoke != null) {
                    try {
                        iPushInvoke.call(dataBuffer, binderC3497h0);
                    } catch (Exception e2) {
                        e2.toString();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }

        /* JADX INFO: renamed from: b */
        public final synchronized void m17534b() {
            try {
                C3477b.m17493a(C3533z.this.f11949a);
                this.f11954d = null;
                Iterator<AbstractC3492f1<?>> it = this.f11951a.iterator();
                while (it.hasNext()) {
                    m17532a(it.next());
                }
                this.f11951a.clear();
            } catch (Throwable th) {
                throw th;
            }
        }

        /* JADX INFO: renamed from: a */
        public final synchronized void m17533a(HonorPushErrorEnum honorPushErrorEnum) {
            try {
                C3477b.m17493a(C3533z.this.f11949a);
                Iterator<AbstractC3492f1<?>> it = this.f11951a.iterator();
                while (it.hasNext()) {
                    it.next().m17514b(honorPushErrorEnum.toApiException(), null);
                }
                this.f11951a.clear();
                this.f11954d = honorPushErrorEnum;
                m17531a();
                C3533z.this.f11950b.remove(this.f11955e);
            } catch (Throwable th) {
                throw th;
            }
        }

        /* JADX INFO: renamed from: a */
        public void m17531a() {
            C3477b.m17493a(C3533z.this.f11949a);
            C3485d0 c3485d0 = (C3485d0) this.f11953c;
            int i = c3485d0.f11852a.get();
            if (i != 3) {
                if (i != 5) {
                    return;
                }
                c3485d0.f11852a.set(4);
            } else {
                ServiceConnectionC3491f0 serviceConnectionC3491f0 = c3485d0.f11855d;
                if (serviceConnectionC3491f0 != null) {
                    serviceConnectionC3491f0.m17513b();
                }
                c3485d0.f11852a.set(1);
            }
        }
    }
}

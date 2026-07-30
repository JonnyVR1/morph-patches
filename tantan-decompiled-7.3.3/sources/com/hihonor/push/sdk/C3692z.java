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
public class C3692z implements Handler.Callback {

    /* JADX INFO: renamed from: c */
    public static final C3692z f12689c = new C3692z();

    /* JADX INFO: renamed from: a */
    public final Handler f12690a;

    /* JADX INFO: renamed from: b */
    public final Map<C3686w, a> f12691b = new ConcurrentHashMap(5, 0.75f, 1);

    /* JADX INFO: renamed from: com.hihonor.push.sdk.z$b */
    public static class b implements InterfaceC3659i0 {

        /* JADX INFO: renamed from: a */
        public AbstractC3651f1<?> f12698a;

        public b(AbstractC3651f1<?> abstractC3651f1) {
            this.f12698a = abstractC3651f1;
        }
    }

    public C3692z() {
        HandlerThread handlerThread = new HandlerThread("HonorApiManager");
        handlerThread.start();
        this.f12690a = new Handler(handlerThread.getLooper(), this);
    }

    /* JADX INFO: renamed from: a */
    public <TResult> C3635a1 m18607a(AbstractC3651f1<TResult> abstractC3651f1) {
        C3669n0<TResult> c3669n0 = new C3669n0<>();
        abstractC3651f1.f12608a = c3669n0;
        Handler handler = this.f12690a;
        handler.sendMessage(handler.obtainMessage(1, abstractC3651f1));
        return c3669n0.f12642a;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        a aVar;
        int i = message.what;
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            AbstractC3651f1 abstractC3651f1 = (AbstractC3651f1) message.obj;
            C3686w c3686w = abstractC3651f1.f12611d;
            if (c3686w != null && this.f12691b.containsKey(c3686w) && (aVar = this.f12691b.get(c3686w)) != null) {
                synchronized (aVar) {
                    try {
                        aVar.f12693b.remove(abstractC3651f1);
                        if (aVar.f12692a.peek() == null || aVar.f12693b.peek() == null) {
                            aVar.m18608a();
                            C3692z.this.f12691b.remove(aVar.f12696e);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return true;
        }
        AbstractC3651f1<?> abstractC3651f2 = (AbstractC3651f1) message.obj;
        C3686w c3686w2 = abstractC3651f2.f12611d;
        a aVar2 = this.f12691b.get(c3686w2);
        if (aVar2 == null) {
            aVar2 = new a(c3686w2);
            this.f12691b.put(c3686w2, aVar2);
        }
        synchronized (aVar2) {
            try {
                C3636b.m18570a(C3692z.this.f12690a);
                if (((C3644d0) aVar2.f12694c).m18587a()) {
                    aVar2.m18609a(abstractC3651f2);
                } else {
                    aVar2.f12692a.add(abstractC3651f2);
                    HonorPushErrorEnum honorPushErrorEnum = aVar2.f12695d;
                    if (honorPushErrorEnum == null || honorPushErrorEnum.getErrorCode() == 0) {
                        synchronized (aVar2) {
                            try {
                                C3636b.m18570a(C3692z.this.f12690a);
                                if (!((C3644d0) aVar2.f12694c).m18587a() && ((C3644d0) aVar2.f12694c).f12593a.get() != 5) {
                                    C3644d0 c3644d0 = (C3644d0) aVar2.f12694c;
                                    c3644d0.getClass();
                                    int i2 = c3644d0.f12593a.get();
                                    if (i2 != 3 && i2 != 5 && i2 != 4) {
                                        C3664l c3664l = C3664l.f12631e;
                                        int iM18575b = C3636b.m18575b(c3664l.m18597a());
                                        if (iM18575b == HonorPushErrorEnum.SUCCESS.getErrorCode()) {
                                            c3644d0.f12593a.set(5);
                                            RemoteServiceBean remoteServiceBeanM18565a = C3636b.m18565a(c3664l.m18597a());
                                            ServiceConnectionC3650f0 serviceConnectionC3650f0 = new ServiceConnectionC3650f0(remoteServiceBeanM18565a);
                                            c3644d0.f12596d = serviceConnectionC3650f0;
                                            serviceConnectionC3650f0.f12605b = new C3640c0(c3644d0);
                                            if (remoteServiceBeanM18565a.checkServiceInfo()) {
                                                Intent intent = new Intent();
                                                String packageName = serviceConnectionC3650f0.f12604a.getPackageName();
                                                String packageAction = serviceConnectionC3650f0.f12604a.getPackageAction();
                                                String packageServiceName = serviceConnectionC3650f0.f12604a.getPackageServiceName();
                                                if (TextUtils.isEmpty(packageServiceName)) {
                                                    intent.setAction(packageAction);
                                                    intent.setPackage(packageName);
                                                } else {
                                                    intent.setComponent(new ComponentName(packageName, packageServiceName));
                                                }
                                                synchronized (ServiceConnectionC3650f0.f12603e) {
                                                    try {
                                                        if (c3664l.m18597a().bindService(intent, serviceConnectionC3650f0, 1)) {
                                                            Handler handler = serviceConnectionC3650f0.f12606c;
                                                            if (handler != null) {
                                                                handler.removeMessages(1001);
                                                            } else {
                                                                serviceConnectionC3650f0.f12606c = new Handler(Looper.getMainLooper(), new C3647e0(serviceConnectionC3650f0));
                                                            }
                                                            serviceConnectionC3650f0.f12606c.sendEmptyMessageDelayed(1001, 10000L);
                                                        } else {
                                                            serviceConnectionC3650f0.f12607d = true;
                                                            serviceConnectionC3650f0.m18589a(8002001);
                                                        }
                                                    } catch (Throwable th2) {
                                                        throw th2;
                                                    }
                                                }
                                            } else {
                                                Objects.toString(serviceConnectionC3650f0.f12604a);
                                                serviceConnectionC3650f0.m18589a(8002004);
                                            }
                                        } else {
                                            c3644d0.m18586a(iM18575b);
                                        }
                                    }
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    } else {
                        aVar2.m18610a(aVar2.f12695d);
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: com.hihonor.push.sdk.z$a */
    public class a implements InterfaceC3637b0.a {

        /* JADX INFO: renamed from: a */
        public final Queue<AbstractC3651f1<?>> f12692a = new LinkedList();

        /* JADX INFO: renamed from: b */
        public final Queue<AbstractC3651f1<?>> f12693b = new LinkedList();

        /* JADX INFO: renamed from: c */
        public final InterfaceC3637b0 f12694c = new C3644d0(this);

        /* JADX INFO: renamed from: d */
        public HonorPushErrorEnum f12695d = null;

        /* JADX INFO: renamed from: e */
        public final C3686w f12696e;

        public a(C3686w c3686w) {
            this.f12696e = c3686w;
        }

        /* JADX INFO: renamed from: a */
        public final synchronized void m18609a(AbstractC3651f1<?> abstractC3651f1) {
            Type type;
            try {
                this.f12693b.add(abstractC3651f1);
                InterfaceC3637b0 interfaceC3637b0 = this.f12694c;
                b bVar = new b(abstractC3651f1);
                abstractC3651f1.getClass();
                Object objNewInstance = null;
                try {
                    Type genericSuperclass = abstractC3651f1.getClass().getGenericSuperclass();
                    Class cls = (genericSuperclass == null || (type = ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]) == null) ? null : (Class) type;
                    if (cls != null && !cls.isPrimitive()) {
                        objNewInstance = cls.newInstance();
                    }
                } catch (Exception e) {
                    C3639c.m18580a("In newResponseInstance, instancing exception." + e.getMessage());
                }
                BinderC3656h0 binderC3656h0 = new BinderC3656h0(objNewInstance, bVar);
                IPushInvoke iPushInvoke = ((C3644d0) interfaceC3637b0).f12594b;
                String str = abstractC3651f1.f12609b;
                RequestHeader requestHeader = abstractC3651f1.f12612e;
                IMessageEntity iMessageEntity = abstractC3651f1.f12610c;
                Bundle bundle = new Bundle();
                Bundle bundle2 = new Bundle();
                MessageCodec.formMessageEntity(requestHeader, bundle);
                MessageCodec.formMessageEntity(iMessageEntity, bundle2);
                DataBuffer dataBuffer = new DataBuffer(str, bundle, bundle2);
                if (iPushInvoke != null) {
                    try {
                        iPushInvoke.call(dataBuffer, binderC3656h0);
                    } catch (Exception e2) {
                        e2.toString();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }

        /* JADX INFO: renamed from: b */
        public final synchronized void m18611b() {
            try {
                C3636b.m18570a(C3692z.this.f12690a);
                this.f12695d = null;
                Iterator<AbstractC3651f1<?>> it = this.f12692a.iterator();
                while (it.hasNext()) {
                    m18609a(it.next());
                }
                this.f12692a.clear();
            } catch (Throwable th) {
                throw th;
            }
        }

        /* JADX INFO: renamed from: a */
        public final synchronized void m18610a(HonorPushErrorEnum honorPushErrorEnum) {
            try {
                C3636b.m18570a(C3692z.this.f12690a);
                Iterator<AbstractC3651f1<?>> it = this.f12692a.iterator();
                while (it.hasNext()) {
                    it.next().m18591b(honorPushErrorEnum.toApiException(), null);
                }
                this.f12692a.clear();
                this.f12695d = honorPushErrorEnum;
                m18608a();
                C3692z.this.f12691b.remove(this.f12696e);
            } catch (Throwable th) {
                throw th;
            }
        }

        /* JADX INFO: renamed from: a */
        public void m18608a() {
            C3636b.m18570a(C3692z.this.f12690a);
            C3644d0 c3644d0 = (C3644d0) this.f12694c;
            int i = c3644d0.f12593a.get();
            if (i != 3) {
                if (i != 5) {
                    return;
                }
                c3644d0.f12593a.set(4);
            } else {
                ServiceConnectionC3650f0 serviceConnectionC3650f0 = c3644d0.f12596d;
                if (serviceConnectionC3650f0 != null) {
                    serviceConnectionC3650f0.m18590b();
                }
                c3644d0.f12593a.set(1);
            }
        }
    }
}

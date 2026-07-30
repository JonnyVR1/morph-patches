package p153l;

import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.hellogroup.p036mk.core.utils.globalevent.MKEventManager;
import kotlin.Metadata;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ)\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m88121d2 = {"Ll/h4k;", "Ll/g4k;", "<init>", "()V", "Ll/g4k$a;", "subscriber", "", "a", "(Ll/g4k$a;)V", "b", "", "eventName", "dsts", "Lorg/json/JSONObject;", "msg", "c", "(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V", NotificationCompat.CATEGORY_EVENT, Constants.INAPP_DATA_TAG, "(Ljava/lang/String;)V", "Companion", "MKBusiness_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class h4k implements g4k {
    @Override // p153l.g4k
    /* JADX INFO: renamed from: a */
    public void mo128892a(@NotNull g4k.InterfaceC17150a subscriber) {
        subscriber.getClass();
        MKEventManager.m18492b().m18494d(new hcg0(subscriber), "mk");
        jzv.m147732e("GlobalEventAdapterImp", "register---" + subscriber);
    }

    @Override // p153l.g4k
    /* JADX INFO: renamed from: b */
    public void mo128893b(@NotNull g4k.InterfaceC17150a subscriber) {
        subscriber.getClass();
        MKEventManager.m18492b().m18496f(new hcg0(subscriber), "mk");
        jzv.m147732e("GlobalEventAdapterImp", "unregister---" + subscriber);
    }

    @Override // p153l.g4k
    /* JADX INFO: renamed from: c */
    public void mo128894c(@NotNull String eventName, @NotNull String dsts, @Nullable JSONObject msg) {
        eventName.getClass();
        dsts.getClass();
        MKEventManager.Event eventM18501c = new MKEventManager.Event(eventName).m18506k("mk").m18501c(StringsKt.split$default(dsts, new String[]{"|"}, false, 0, 6, null));
        if (msg != null) {
            eventM18501c.m18505i(msg.toString());
        }
        MKEventManager.m18492b().m18495e(eventM18501c);
        jzv.m147732e("GlobalEventAdapterImp", "sendEvent---" + eventName + "---" + dsts + "---" + msg);
    }

    @Override // p153l.g4k
    /* JADX INFO: renamed from: d */
    public void mo128895d(@NotNull String event) {
        event.getClass();
        MKEventManager.m18492b().m18495e(new MKEventManager.Event(event));
        jzv.m147732e("GlobalEventAdapterImp", "sendEvent---" + event);
    }
}

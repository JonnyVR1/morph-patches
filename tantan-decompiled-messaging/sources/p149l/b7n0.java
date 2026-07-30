package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.LayoutRes;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.VirtualVoiceMotionType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u000eJ!\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u0012\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0015\u0010\u0018¨\u0006\u0019"}, m87232d2 = {"Ll/b7n0;", "", "", "type", AuthenticationTokenClaims.JSON_KEY_NAME, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ll/s7n0;", "presenter", "Landroid/view/View;", "b", "(Ll/s7n0;)Landroid/view/View;", "", "c", "()I", Constants.INAPP_DATA_TAG, "Landroid/content/Context;", "context", "resource", "f", "(Landroid/content/Context;I)Landroid/view/View;", "a", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class b7n0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String name;

    public b7n0(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.type = str;
        this.name = str2;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @NotNull
    /* JADX INFO: renamed from: b */
    public final View m100687b(@NotNull s7n0<?> presenter) {
        presenter.getClass();
        Act act = presenter.act();
        act.getClass();
        String str = this.type;
        switch (str.hashCode()) {
            case -1779230753:
                if (str.equals(VirtualVoiceMotionType.undercover)) {
                    View viewM100691f = m100691f(act, t6c0.f168409k7);
                    bsm<D> bsmVarM182507Y3 = presenter.m182507Y3();
                    viewM100691f.getClass();
                    return viewM100691f;
                }
                break;
            case -661856701:
                if (str.equals("auction")) {
                    View viewM100691f2 = m100691f(act, t6c0.f168254Y6);
                    bsm<D> bsmVarM182507Y4 = presenter.m182507Y3();
                    viewM100691f2.getClass();
                    return viewM100691f2;
                }
                break;
            case 106541:
                if (str.equals(VirtualVoiceMotionType.ktv)) {
                    View viewM100691f3 = m100691f(act, t6c0.f168318d7);
                    bsm<D> bsmVarM182507Y5 = presenter.m182507Y3();
                    viewM100691f3.getClass();
                    return viewM100691f3;
                }
                break;
            case 1609801911:
                if (str.equals(VirtualVoiceMotionType.chatTopic)) {
                    View viewM100691f4 = m100691f(act, t6c0.f168422l7);
                    bsm<D> bsmVarM182507Y6 = presenter.m182507Y3();
                    viewM100691f4.getClass();
                    return viewM100691f4;
                }
                break;
        }
        View viewM100691f5 = m100691f(act, t6c0.f168218V6);
        bsm<D> bsmVarM182507Y7 = presenter.m182507Y3();
        viewM100691f5.getClass();
        return viewM100691f5;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: c */
    public final int m100688c() {
        String str = this.type;
        switch (str.hashCode()) {
            case -1779230753:
                if (str.equals(VirtualVoiceMotionType.undercover)) {
                    return i3c0.f111044ia;
                }
                break;
            case -661856701:
                if (str.equals("auction")) {
                    return i3c0.f111163s9;
                }
                break;
            case 106541:
                if (str.equals(VirtualVoiceMotionType.ktv)) {
                    return i3c0.f111175t9;
                }
                break;
            case 1296545175:
                if (str.equals(VirtualVoiceMotionType.backgroundMusic)) {
                    return i3c0.f111199v9;
                }
                break;
            case 1609801911:
                if (str.equals(VirtualVoiceMotionType.chatTopic)) {
                    return i3c0.f111223x9;
                }
                break;
        }
        return i3c0.f111139q9;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: d */
    public final int m100689d() {
        String str = this.type;
        switch (str.hashCode()) {
            case -1779230753:
                if (str.equals(VirtualVoiceMotionType.undercover)) {
                    return i3c0.f111211w9;
                }
                break;
            case -661856701:
                if (str.equals("auction")) {
                    return i3c0.f111211w9;
                }
                break;
            case 106541:
                if (str.equals(VirtualVoiceMotionType.ktv)) {
                    return i3c0.f111187u9;
                }
                break;
            case 1296545175:
                if (str.equals(VirtualVoiceMotionType.backgroundMusic)) {
                    return i3c0.f111211w9;
                }
                break;
            case 1609801911:
                if (str.equals(VirtualVoiceMotionType.chatTopic)) {
                    return i3c0.f111235y9;
                }
                break;
        }
        return i3c0.f111151r9;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: f */
    public final View m100691f(Context context, @LayoutRes int resource) {
        View viewInflate = LayoutInflater.from(context).inflate(resource, (ViewGroup) null, false);
        viewInflate.getClass();
        return viewInflate;
    }
}

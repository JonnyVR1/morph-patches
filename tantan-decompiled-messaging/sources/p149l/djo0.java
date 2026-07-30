package p149l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VText;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m87232d2 = {"Ll/djo0;", "Ll/jav;", "Ll/hjo0;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "init", "()V", "Lcom/p1/mobile/longlink/msg/liveroom/LongLinkLiveMessage$VoiceSettleGuideMessage;", "msg", BaseSei.f13930X, "(Lcom/p1/mobile/longlink/msg/liveroom/LongLinkLiveMessage$VoiceSettleGuideMessage;)V", "", "k", "()I", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class djo0 extends jav<hjo0<?>> {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    public djo0(@NotNull Context context) {
        context.getClass();
        this.context = context;
    }

    /* JADX INFO: renamed from: y */
    public static final void m112089y(djo0 djo0Var, Drawable drawable) {
        drawable.getClass();
        djo0Var.f117122f.setImageDrawable(drawable);
    }

    /* JADX INFO: renamed from: z */
    public static final Unit m112090z(djo0 djo0Var, View view) {
        view.getClass();
        ((hjo0) djo0Var.f47706b).m131390S3();
        return Unit.INSTANCE;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder, p149l.vpl
    public void init() {
        super.init();
        this.f117123g.m68748c(-1, -1);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder
    /* JADX INFO: renamed from: k */
    public int mo71728k() {
        return i3c0.f111189v;
    }

    /* JADX INFO: renamed from: x */
    public void m112091x(@Nullable LongLinkLiveMessage.VoiceSettleGuideMessage msg) {
        super.m71732q(msg);
        if (msg != null) {
            this.f117124h.setText(msg.getTitle());
            hxs.m133395h(this.context, msg.getAvatarsList(), t100.f167229D).observeOn(jo0.m142408a()).subscribe(ffw.m121197h(new e30() { // from class: l.bjo0
                @Override // p149l.e30
                public final void call(Object obj) {
                    djo0.m112089y(this.f75927a, (Drawable) obj);
                }
            }));
            this.f117125i.removeAllViews();
            List<String> tagsList = msg.getTagsList();
            if (tagsList != null) {
                for (String str : tagsList) {
                    VText vText = new VText(((hjo0) this.f47706b).m104249C0());
                    vText.setText(str);
                    vText.setTextColor(kvc0.m147352a(h1c0.f105386m1));
                    int i = xdl0.f192404f;
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
                    layoutParams.leftMargin = t100.f167256e;
                    vText.setBackground(kvc0.m147353b(i3c0.f111011g1));
                    vText.setTextSize(10.0f);
                    int i2 = t100.f167258g;
                    int i3 = t100.f167255d;
                    vText.setPadding(i2, i3, i2, i3);
                    this.f117125i.addView(vText, layoutParams);
                }
            }
            VText vText2 = this.f117126j;
            vText2.getClass();
            cxq.m109105c(vText2, new Function1() { // from class: l.cjo0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return djo0.m112090z(this.f81211a, (View) obj);
                }
            });
        }
    }
}

package p153l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VText;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m88121d2 = {"Ll/hso0;", "Ll/kcv;", "Ll/lso0;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "init", "()V", "Lcom/p1/mobile/longlink/msg/liveroom/LongLinkLiveMessage$VoiceSettleGuideMessage;", "msg", BaseSei.f14624X, "(Lcom/p1/mobile/longlink/msg/liveroom/LongLinkLiveMessage$VoiceSettleGuideMessage;)V", "", "k", "()I", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class hso0 extends kcv<lso0<?>> {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    public hso0(@NotNull Context context) {
        context.getClass();
        this.context = context;
    }

    /* JADX INFO: renamed from: y */
    public static final void m137024y(hso0 hso0Var, Drawable drawable) {
        drawable.getClass();
        hso0Var.f125102f.setImageDrawable(drawable);
    }

    /* JADX INFO: renamed from: z */
    public static final Unit m137025z(hso0 hso0Var, View view) {
        view.getClass();
        ((lso0) hso0Var.f48554b).m155724S3();
        return Unit.INSTANCE;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder, p153l.isl
    public void init() {
        super.init();
        this.f125103g.m69931c(-1, -1);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder
    /* JADX INFO: renamed from: k */
    public int mo72911k() {
        return obc0.f146517v;
    }

    /* JADX INFO: renamed from: x */
    public void m137026x(@Nullable LongLinkLiveMessage.VoiceSettleGuideMessage msg) {
        super.m72915q(msg);
        if (msg != null) {
            this.f125104h.setText(msg.getTitle());
            izs.m142857h(this.context, msg.getAvatarsList(), qa00.f156291D).observeOn(fo0.m126432a()).subscribe(dhw.m115829h(new y20() { // from class: l.fso0
                @Override // p153l.y20
                public final void call(Object obj) {
                    hso0.m137024y(this.f100668a, (Drawable) obj);
                }
            }));
            this.f125105i.removeAllViews();
            List<String> tagsList = msg.getTagsList();
            if (tagsList != null) {
                for (String str : tagsList) {
                    VText vText = new VText(((lso0) this.f48554b).m113230C0());
                    vText.setText(str);
                    vText.setTextColor(n3d0.m161277a(n9c0.f140847m1));
                    int i = bnl0.f77545f;
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
                    layoutParams.leftMargin = qa00.f156318e;
                    vText.setBackground(n3d0.m161278b(obc0.f146339g1));
                    vText.setTextSize(10.0f);
                    int i2 = qa00.f156320g;
                    int i3 = qa00.f156317d;
                    vText.setPadding(i2, i3, i2, i3);
                    this.f125105i.addView(vText, layoutParams);
                }
            }
            VText vText2 = this.f125106j;
            vText2.getClass();
            czq.m113347c(vText2, new Function1() { // from class: l.gso0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return hso0.m137025z(this.f106320a, (View) obj);
                }
            });
        }
    }
}

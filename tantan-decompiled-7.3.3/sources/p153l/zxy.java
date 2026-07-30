package p153l;

import android.animation.ValueAnimator;
import com.p051p1.mobile.putong.core.p058ui.messages.model.messagebar.MessageBarActionItemType;
import com.p051p1.mobile.putong.core.p058ui.messages.model.messagebar.MessageBarActionItemView;

/* JADX INFO: loaded from: classes4.dex */
public class zxy extends yxy {

    /* JADX INFO: renamed from: m */
    public int f206527m;

    /* JADX INFO: renamed from: l.zxy$a */
    public class C21925a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f206528a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ MessageBarActionItemView f206529b;

        public C21925a(boolean z, MessageBarActionItemView messageBarActionItemView) {
            this.f206528a = z;
            this.f206529b = messageBarActionItemView;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            boolean z = this.f206528a;
            zxy zxyVar = zxy.this;
            this.f206529b.f32776a.setColorFilter(z ? zxyVar.m217745m(zxyVar.f202018j, zxyVar.f202017i, iIntValue) : zxyVar.m217745m(zxyVar.f202017i, zxyVar.f202018j, iIntValue));
        }
    }

    public zxy(MessageBarActionItemType messageBarActionItemType, int i) {
        super(messageBarActionItemType, i);
        this.f206527m = 0;
    }

    @Override // p153l.yxy, p153l.rxy
    /* JADX INFO: renamed from: c */
    public void mo100971c(MessageBarActionItemView messageBarActionItemView, int i, int i2) {
        super.mo100971c(messageBarActionItemView, i, i2);
        m222095o(messageBarActionItemView);
    }

    /* JADX INFO: renamed from: o */
    public final void m222095o(MessageBarActionItemView messageBarActionItemView) {
        boolean z = (this.f206527m & 1) > 0;
        if (z != ((this.f165389f & 1) > 0)) {
            ValueAnimator duration = ValueAnimator.ofInt(0, 100).setDuration(150L);
            duration.addUpdateListener(new C21925a(z, messageBarActionItemView));
            duration.start();
        }
        this.f206527m = this.f165389f;
    }

    public zxy(MessageBarActionItemType messageBarActionItemType, int i, int i2) {
        super(messageBarActionItemType, i, i2);
        this.f206527m = 0;
    }
}

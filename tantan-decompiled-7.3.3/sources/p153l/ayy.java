package p153l;

import android.animation.ValueAnimator;
import com.p051p1.mobile.putong.core.p058ui.messages.model.messagebar.MessageBarActionItemType;
import com.p051p1.mobile.putong.core.p058ui.messages.model.messagebar.MessageBarActionItemView;
import p151v.VImage;

/* JADX INFO: loaded from: classes4.dex */
public class ayy extends yxy {

    /* JADX INFO: renamed from: m */
    public int f74060m;

    /* JADX INFO: renamed from: l.ayy$a */
    public class C15864a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f74061a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f74062b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ MessageBarActionItemView f74063c;

        public C15864a(boolean z, boolean z2, MessageBarActionItemView messageBarActionItemView) {
            this.f74061a = z;
            this.f74062b = z2;
            this.f74063c = messageBarActionItemView;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iM217745m;
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            boolean z = this.f74061a;
            ayy ayyVar = ayy.this;
            if (z) {
                boolean z2 = this.f74062b;
                iM217745m = ayyVar.m217745m(z2 ? ayyVar.f202020l : ayyVar.f202018j, z2 ? ayyVar.f202019k : ayyVar.f202017i, iIntValue);
            } else {
                boolean z3 = this.f74062b;
                iM217745m = ayyVar.m217745m(z3 ? ayyVar.f202019k : ayyVar.f202017i, z3 ? ayyVar.f202020l : ayyVar.f202018j, iIntValue);
            }
            this.f74063c.f32776a.setColorFilter(iM217745m);
            this.f74063c.f32776a.setRotation(this.f74061a ? ((iIntValue * 45.0f) / 100.0f) - 45.0f : (iIntValue * (-45.0f)) / 100.0f);
        }
    }

    public ayy(MessageBarActionItemType messageBarActionItemType, int i) {
        super(messageBarActionItemType, i);
        this.f74060m = 0;
    }

    /* JADX INFO: renamed from: o */
    private void m100970o(MessageBarActionItemView messageBarActionItemView) {
        int i;
        boolean z = (this.f74060m & 1) > 0;
        boolean z2 = (this.f165389f & 1) > 0;
        boolean zM183574e = m183574e(2);
        if (z != z2) {
            if (gta.m132210e().m132214d().mo34702I4()) {
                VImage vImage = messageBarActionItemView.f32776a;
                if (z) {
                    i = zM183574e ? this.f202019k : this.f202017i;
                } else {
                    i = zM183574e ? this.f202020l : this.f202018j;
                }
                vImage.setColorFilter(i);
            } else {
                ValueAnimator duration = ValueAnimator.ofInt(0, 100).setDuration(280L);
                duration.addUpdateListener(new C15864a(z, zM183574e, messageBarActionItemView));
                duration.start();
            }
        }
        this.f74060m = this.f165389f;
    }

    @Override // p153l.yxy, p153l.rxy
    /* JADX INFO: renamed from: c */
    public void mo100971c(MessageBarActionItemView messageBarActionItemView, int i, int i2) {
        super.mo100971c(messageBarActionItemView, i, i2);
        if (m183574e(2) && gta.m132210e().m132214d().mo34702I4()) {
            if (m183574e(1)) {
                int i3 = this.f165386c;
                if (i3 > 0) {
                    messageBarActionItemView.f32776a.setImageResource(i3);
                }
            } else {
                int i4 = this.f165385b;
                if (i4 > 0) {
                    messageBarActionItemView.f32776a.setImageResource(i4);
                }
            }
        }
        m100970o(messageBarActionItemView);
    }

    public ayy(MessageBarActionItemType messageBarActionItemType, int i, int i2) {
        super(messageBarActionItemType, i, i2);
        this.f74060m = 0;
    }
}

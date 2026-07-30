package p149l;

import android.animation.ValueAnimator;
import com.p046p1.mobile.putong.core.p053ui.messages.model.messagebar.MessageBarActionItemType;
import com.p046p1.mobile.putong.core.p053ui.messages.model.messagebar.MessageBarActionItemView;
import p147v.VImage;

/* JADX INFO: loaded from: classes3.dex */
public class dpy extends bpy {

    /* JADX INFO: renamed from: m */
    public int f87364m;

    /* JADX INFO: renamed from: l.dpy$a */
    public class C16428a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f87365a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f87366b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ MessageBarActionItemView f87367c;

        public C16428a(boolean z, boolean z2, MessageBarActionItemView messageBarActionItemView) {
            this.f87365a = z;
            this.f87366b = z2;
            this.f87367c = messageBarActionItemView;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iM103099m;
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            boolean z = this.f87365a;
            dpy dpyVar = dpy.this;
            if (z) {
                boolean z2 = this.f87366b;
                iM103099m = dpyVar.m103099m(z2 ? dpyVar.f76690l : dpyVar.f76688j, z2 ? dpyVar.f76689k : dpyVar.f76687i, iIntValue);
            } else {
                boolean z3 = this.f87366b;
                iM103099m = dpyVar.m103099m(z3 ? dpyVar.f76689k : dpyVar.f76687i, z3 ? dpyVar.f76690l : dpyVar.f76688j, iIntValue);
            }
            this.f87367c.f31928a.setColorFilter(iM103099m);
            this.f87367c.f31928a.setRotation(this.f87365a ? ((iIntValue * 45.0f) / 100.0f) - 45.0f : (iIntValue * (-45.0f)) / 100.0f);
        }
    }

    public dpy(MessageBarActionItemType messageBarActionItemType, int i) {
        super(messageBarActionItemType, i);
        this.f87364m = 0;
    }

    /* JADX INFO: renamed from: o */
    private void m112966o(MessageBarActionItemView messageBarActionItemView) {
        int i;
        boolean z = (this.f87364m & 1) > 0;
        boolean z2 = (this.f177555f & 1) > 0;
        boolean zM194574e = m194574e(2);
        if (z != z2) {
            if (ura.m195053e().m195057d().mo33699I4()) {
                VImage vImage = messageBarActionItemView.f31928a;
                if (z) {
                    i = zM194574e ? this.f76689k : this.f76687i;
                } else {
                    i = zM194574e ? this.f76690l : this.f76688j;
                }
                vImage.setColorFilter(i);
            } else {
                ValueAnimator duration = ValueAnimator.ofInt(0, 100).setDuration(280L);
                duration.addUpdateListener(new C16428a(z, zM194574e, messageBarActionItemView));
                duration.start();
            }
        }
        this.f87364m = this.f177555f;
    }

    @Override // p149l.bpy, p149l.uoy
    /* JADX INFO: renamed from: c */
    public void mo98197c(MessageBarActionItemView messageBarActionItemView, int i, int i2) {
        super.mo98197c(messageBarActionItemView, i, i2);
        if (m194574e(2) && ura.m195053e().m195057d().mo33699I4()) {
            if (m194574e(1)) {
                int i3 = this.f177552c;
                if (i3 > 0) {
                    messageBarActionItemView.f31928a.setImageResource(i3);
                }
            } else {
                int i4 = this.f177551b;
                if (i4 > 0) {
                    messageBarActionItemView.f31928a.setImageResource(i4);
                }
            }
        }
        m112966o(messageBarActionItemView);
    }

    public dpy(MessageBarActionItemType messageBarActionItemType, int i, int i2) {
        super(messageBarActionItemType, i, i2);
        this.f87364m = 0;
    }
}

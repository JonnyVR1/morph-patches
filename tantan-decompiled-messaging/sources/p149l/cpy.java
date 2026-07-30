package p149l;

import android.animation.ValueAnimator;
import com.p046p1.mobile.putong.core.p053ui.messages.model.messagebar.MessageBarActionItemType;
import com.p046p1.mobile.putong.core.p053ui.messages.model.messagebar.MessageBarActionItemView;

/* JADX INFO: loaded from: classes3.dex */
public class cpy extends bpy {

    /* JADX INFO: renamed from: m */
    public int f82005m;

    /* JADX INFO: renamed from: l.cpy$a */
    public class C16208a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f82006a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ MessageBarActionItemView f82007b;

        public C16208a(boolean z, MessageBarActionItemView messageBarActionItemView) {
            this.f82006a = z;
            this.f82007b = messageBarActionItemView;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            boolean z = this.f82006a;
            cpy cpyVar = cpy.this;
            this.f82007b.f31928a.setColorFilter(z ? cpyVar.m103099m(cpyVar.f76688j, cpyVar.f76687i, iIntValue) : cpyVar.m103099m(cpyVar.f76687i, cpyVar.f76688j, iIntValue));
        }
    }

    public cpy(MessageBarActionItemType messageBarActionItemType, int i) {
        super(messageBarActionItemType, i);
        this.f82005m = 0;
    }

    @Override // p149l.bpy, p149l.uoy
    /* JADX INFO: renamed from: c */
    public void mo98197c(MessageBarActionItemView messageBarActionItemView, int i, int i2) {
        super.mo98197c(messageBarActionItemView, i, i2);
        m108207o(messageBarActionItemView);
    }

    /* JADX INFO: renamed from: o */
    public final void m108207o(MessageBarActionItemView messageBarActionItemView) {
        boolean z = (this.f82005m & 1) > 0;
        if (z != ((this.f177555f & 1) > 0)) {
            ValueAnimator duration = ValueAnimator.ofInt(0, 100).setDuration(150L);
            duration.addUpdateListener(new C16208a(z, messageBarActionItemView));
            duration.start();
        }
        this.f82005m = this.f177555f;
    }

    public cpy(MessageBarActionItemType messageBarActionItemType, int i, int i2) {
        super(messageBarActionItemType, i, i2);
        this.f82005m = 0;
    }
}

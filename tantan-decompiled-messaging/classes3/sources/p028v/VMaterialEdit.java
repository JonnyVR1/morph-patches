package p028v;

import android.content.Context;
import android.util.AttributeSet;
import com.rengwuxian.materialedittext.MaterialEditText;
import l.t0c0;
import p003l.dqh0;
import p003l.eqh0;
import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VMaterialEdit extends MaterialEditText {
    public VMaterialEdit(Context context) {
        super(context);
        m11607G(context, null, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G */
    public final void m11607G(Context context, AttributeSet attributeSet, int i) {
        eqh0.m3922a(this, context, attributeSet, i);
        setFloatingLabel(2);
        setPrimaryColor(context.getResources().getColor(t0c0.D));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H */
    public C1099c<CharSequence> m11608H() {
        return dqh0.m3631c(this, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: I */
    public C1099c<CharSequence> m11609I(boolean z) {
        return dqh0.m3631c(this, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setTextAppearance(Context context, int i) {
        super/*android.widget.TextView*/.setTextAppearance(context, i);
        eqh0.m3923b(this, context, i);
    }

    public VMaterialEdit(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m11607G(context, attributeSet, 0);
    }

    public VMaterialEdit(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m11607G(context, attributeSet, i);
    }
}

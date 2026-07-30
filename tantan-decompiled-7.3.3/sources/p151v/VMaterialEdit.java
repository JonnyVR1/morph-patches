package p151v;

import android.content.Context;
import android.util.AttributeSet;
import com.rengwuxian.materialedittext.MaterialEditText;
import p137rx.C22421c;
import p153l.kyh0;
import p153l.lyh0;
import p153l.z8c0;

/* JADX INFO: loaded from: classes3.dex */
public class VMaterialEdit extends MaterialEditText {
    public VMaterialEdit(Context context) {
        super(context);
        m224372G(context, null, 0);
    }

    /* JADX INFO: renamed from: G */
    public final void m224372G(Context context, AttributeSet attributeSet, int i) {
        lyh0.m156281a(this, context, attributeSet, i);
        setFloatingLabel(2);
        setPrimaryColor(context.getResources().getColor(z8c0.f203337D));
    }

    /* JADX INFO: renamed from: H */
    public C22421c<CharSequence> m224373H() {
        return kyh0.m151971c(this, true);
    }

    /* JADX INFO: renamed from: I */
    public C22421c<CharSequence> m224374I(boolean z) {
        return kyh0.m151971c(this, z);
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        lyh0.m156282b(this, context, i);
    }

    public VMaterialEdit(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m224372G(context, attributeSet, 0);
    }

    public VMaterialEdit(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m224372G(context, attributeSet, i);
    }
}

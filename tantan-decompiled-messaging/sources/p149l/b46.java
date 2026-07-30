package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.newui.messages.addressbook.ConversationAddressBookMatchHeadLayout;

/* JADX INFO: loaded from: classes11.dex */
public class b46 extends fi2 {
    public b46(PutongFrag putongFrag) {
        super(putongFrag);
    }

    @Override // p149l.fi2, p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return this.f97616m.inflater().inflate(f6c0.f95987s, viewGroup, false);
        }
        return i == 2 ? this.f97616m.inflater().inflate(f6c0.f95346F, viewGroup, false) : super.mo28825D(viewGroup, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.dac0
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, Conversation conversation, int i, int i2) {
        if (i == 2) {
            ((gj0) view).mo40539a(this, conversation, i2, true);
        } else if (i == 1) {
            ((ConversationAddressBookMatchHeadLayout) view).m41882i(this);
        } else if (i == 0) {
            m100213R(view);
        }
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m100212Q(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        RecyclerView.C0578p c0578p = (RecyclerView.C0578p) view.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) c0578p).topMargin = ((xdl0.m208338J(this.f97616m).y - iArr[1]) - t100.m186890d(208.0f)) / 2;
        view.setLayoutParams(c0578p);
        this.f97607d.setText("暂时没有新配对");
        this.f97606c.setImageResource(x2c0.f190251j0);
        xdl0.m208344M(view, true);
        xdl0.m208344M(this.f97608e, false);
    }

    /* JADX INFO: renamed from: R */
    public final void m100213R(final View view) {
        view.post(new Runnable() { // from class: l.a46
            @Override // java.lang.Runnable
            public final void run() {
                this.f67456a.m100212Q(view);
            }
        });
    }
}

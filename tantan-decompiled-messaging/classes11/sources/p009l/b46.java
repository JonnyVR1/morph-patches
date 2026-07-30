package p009l;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.core.newui.messages.addressbook.ConversationAddressBookMatchHeadLayout;
import com.p1.mobile.putong.app.PutongFrag;
import com.p1.mobile.putong.core.data.Conversation;
import l.f6c0;
import l.t100;
import l.x2c0;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class b46 extends fi2 {
    public b46(PutongFrag putongFrag) {
        super(putongFrag);
    }

    @Override // p009l.fi2
    /* JADX INFO: renamed from: D */
    public View mo5985D(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return this.f13017m.inflater().inflate(f6c0.s, viewGroup, false);
        }
        return i == 2 ? this.f13017m.inflater().inflate(f6c0.F, viewGroup, false) : super.mo5985D(viewGroup, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public void m11831A(View view, Conversation conversation, int i, int i2) {
        if (i == 2) {
            ((gj0) view).mo4632a(this, conversation, i2, true);
        } else if (i == 1) {
            ((ConversationAddressBookMatchHeadLayout) view).m6016i(this);
        } else if (i == 0) {
            m11834R(view);
        }
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m11833Q(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) pVar).topMargin = ((xdl0.J(this.f13017m).y - iArr[1]) - t100.d(208.0f)) / 2;
        view.setLayoutParams(pVar);
        this.f13008d.setText("暂时没有新配对");
        this.f13007c.setImageResource(x2c0.j0);
        xdl0.M(view, true);
        xdl0.M(this.f13009e, false);
    }

    /* JADX INFO: renamed from: R */
    public final void m11834R(final View view) {
        view.post(new Runnable() { // from class: l.a46
            @Override // java.lang.Runnable
            public final void run() {
                this.f9200a.m11833Q(view);
            }
        });
    }
}

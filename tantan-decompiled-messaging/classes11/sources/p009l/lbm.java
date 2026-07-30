package p009l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.profile.views.FlowTagsView;
import com.p1.mobile.putong.data.IdealTag;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.cwf0;
import l.e16;
import l.e30;
import l.j760;
import l.mbm;
import l.mji0;
import l.mkd0;
import l.osi0;
import l.qib0;
import l.t100;
import l.vwb;
import l.w0c0;
import l.x2c0;
import l.xdl0;
import l.zvf0;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class lbm extends inf {

    /* JADX INFO: renamed from: h */
    public View f16045h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f16046i;

    /* JADX INFO: renamed from: j */
    public ImageView f16047j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f16048k;

    /* JADX INFO: renamed from: l */
    public TextView f16049l;

    /* JADX INFO: renamed from: m */
    public TextView f16050m;

    /* JADX INFO: renamed from: n */
    public FlowTagsView f16051n;

    /* JADX INFO: renamed from: o */
    public TextView f16052o;

    /* JADX INFO: renamed from: p */
    public Act f16053p;

    /* JADX INFO: renamed from: q */
    public String f16054q;

    /* JADX INFO: renamed from: r */
    public cwf0 f16055r;

    /* JADX INFO: renamed from: s */
    public List<IdealTag> f16056s;

    public lbm(@NonNull Context context) {
        super(context);
        m17794L(context);
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m17789D(View view) {
    }

    /* JADX INFO: renamed from: K */
    private String m17793K() {
        return "p_add_ideal_type";
    }

    /* JADX INFO: renamed from: L */
    private void m17794L(Context context) {
        this.f16053p = xdl0.D(context);
        setContentView(m17802H(LayoutInflater.from(context), null));
        setCancelable(false);
        if (this.f16055r == null) {
            this.f16055r = i0e.m16062c(m17793K(), lbm.class.getSimpleName());
        }
    }

    /* JADX INFO: renamed from: M */
    private void m17795M() {
        if ("swipe".equals(this.f16054q)) {
            this.f16049l.setText("你想认识什么样的人？");
            this.f16050m.setText("选择你的理想型，我们会优先推荐你感兴趣的人");
            qib0.G.L0(this.f16048k, "https://auto.tancdn.com/v1/raw/d4b19bd3-58e8-48b9-b81a-b037d4b863f914.webp");
        } else if ("conversation".equals(this.f16054q)) {
            this.f16049l.setText(String.format("%s们都不是你想聊天的类型？", CoreModule.c.e0.p9().isFemale() ? "他" : "她"));
            this.f16050m.setText("选择你的理想型，为你推荐更多适合聊天的对象");
            qib0.G.L0(this.f16048k, "https://auto.tancdn.com/v1/raw/92b47530-df26-49e8-95bc-0357344850d314.webp");
        }
        zvf0.x("e_save_ideal_type", m17793K());
        xdl0.E0(this.f16052o, new View.OnClickListener() { // from class: l.fbm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12906a.m17796O(view);
            }
        });
        xdl0.E0(this.f16047j, new View.OnClickListener() { // from class: l.gbm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13405a.m17797P(view);
            }
        });
        xdl0.E0(this.f16045h, new View.OnClickListener() { // from class: l.hbm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13944a.m17798Q(view);
            }
        });
        xdl0.E0(this.f16046i, new View.OnClickListener() { // from class: l.ibm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                lbm.m17789D(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m17796O(View view) {
        if (vwb.J(this.f16056s)) {
            return;
        }
        this.f16052o.setEnabled(false);
        this.f16052o.setText("正在保存");
        m17809V(this.f16056s);
        zvf0.r("e_save_ideal_type", m17793K());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m17797P(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public /* synthetic */ void m17798Q(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m17799R(DialogInterface dialogInterface) {
        i0e.m16064e(this.f16055r);
    }

    /* JADX INFO: renamed from: H */
    public View m17802H(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return mbm.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: I */
    public final void m17803I() {
        this.f16056s = new ArrayList();
        for (int i = 0; i < this.f16051n.getChildCount(); i++) {
            if (this.f16051n.getChildAt(i).isSelected()) {
                this.f16056s.add((IdealTag) this.f16051n.getChildAt(i).getTag());
            }
        }
        this.f16052o.setEnabled(!vwb.J(this.f16056s));
        this.f16052o.setText(vwb.J(this.f16056s) ? "保存" : String.format("保存 (%d)", Integer.valueOf(this.f16056s.size())));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"ResourceAsColor"})
    /* JADX INFO: renamed from: J */
    public List<View> m17804J(List<IdealTag> list) {
        ArrayList arrayList = new ArrayList();
        for (IdealTag idealTag : list) {
            if (NullChecker.a(idealTag)) {
                TextView textView = new TextView(getContext());
                textView.setBackgroundResource(x2c0.J8);
                textView.setTextColor(e16.d(getContext(), w0c0.U0));
                int i = t100.m;
                int i2 = t100.j;
                textView.setPadding(i, i2, i, i2);
                textView.setText(idealTag.name);
                textView.setTextSize(14.0f);
                mji0.m(textView, t100.d(20.0f));
                textView.setTag(idealTag);
                textView.getPaint().setFakeBoldText(true);
                textView.setOnClickListener(new View.OnClickListener() { // from class: l.dbm
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f11714a.m17805N(view);
                    }
                });
                arrayList.add(textView);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m17805N(View view) {
        if ("正在保存".equals(this.f16052o.getText().toString())) {
            return;
        }
        view.setSelected(!view.isSelected());
        m17803I();
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m17806S(Boolean bool) {
        osi0.g("已保存");
        dismiss();
        CoreModule.c.m0.o8();
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m17807T(Throwable th) {
        m17803I();
    }

    /* JADX INFO: renamed from: U */
    public void m17808U(List<IdealTag> list, String str) {
        this.f16054q = str;
        if ("swipe".equals(str)) {
            this.f16055r.p(new j760[]{vwb.Y("add_ideal_timing", "continue_dislike")});
        } else if ("conversation".equals(str)) {
            this.f16055r.p(new j760[]{vwb.Y("add_ideal_timing", "no_match_to_chat")});
        }
        if (this.f16051n.getChildCount() > 0) {
            this.f16051n.removeAllViews();
        }
        this.f16051n.setTags(m17804J(list));
    }

    /* JADX INFO: renamed from: V */
    public final void m17809V(List<IdealTag> list) {
        this.f16053p.duringCreated(CoreModule.c.e0.ta(list)).subscribe(mkd0.H(new e30() { // from class: l.jbm
            public final void call(Object obj) {
                this.f15043a.m17806S((Boolean) obj);
            }
        }, new e30() { // from class: l.kbm
            public final void call(Object obj) {
                this.f15593a.m17807T((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p009l.inf
    public void show() {
        super.show();
        this.f16055r.p(new j760[]{vwb.Y("add_ideal_timing", "swipe".equals(this.f16054q) ? "continue_dislike" : "no_match_to_chat"), vwb.Y("is_first_add_ideal", Boolean.TRUE)});
        i0e.m16065f(this.f16055r);
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.ebm
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f12488a.m17799R(dialogInterface);
            }
        });
        m17795M();
    }
}

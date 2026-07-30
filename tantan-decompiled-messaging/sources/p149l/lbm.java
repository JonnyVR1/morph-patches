package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.profile.views.FlowTagsView;
import com.p046p1.mobile.putong.data.IdealTag;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes11.dex */
public class lbm extends inf {

    /* JADX INFO: renamed from: h */
    public View f127311h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f127312i;

    /* JADX INFO: renamed from: j */
    public ImageView f127313j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f127314k;

    /* JADX INFO: renamed from: l */
    public TextView f127315l;

    /* JADX INFO: renamed from: m */
    public TextView f127316m;

    /* JADX INFO: renamed from: n */
    public FlowTagsView f127317n;

    /* JADX INFO: renamed from: o */
    public TextView f127318o;

    /* JADX INFO: renamed from: p */
    public Act f127319p;

    /* JADX INFO: renamed from: q */
    public String f127320q;

    /* JADX INFO: renamed from: r */
    public cwf0 f127321r;

    /* JADX INFO: renamed from: s */
    public List<IdealTag> f127322s;

    public lbm(@NonNull Context context) {
        super(context);
        m149242L(context);
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m149237D(View view) {
    }

    /* JADX INFO: renamed from: K */
    private String m149241K() {
        return "p_add_ideal_type";
    }

    /* JADX INFO: renamed from: L */
    private void m149242L(Context context) {
        this.f127319p = (Act) xdl0.m208326D(context);
        setContentView(m149250H(LayoutInflater.from(context), null));
        setCancelable(false);
        if (this.f127321r == null) {
            this.f127321r = i0e.m133794c(m149241K(), lbm.class.getSimpleName());
        }
    }

    /* JADX INFO: renamed from: M */
    private void m149243M() {
        if ("swipe".equals(this.f127320q)) {
            this.f127315l.setText("你想认识什么样的人？");
            this.f127316m.setText("选择你的理想型，我们会优先推荐你感兴趣的人");
            qib0.f154691G.m102331L0(this.f127314k, "https://auto.tancdn.com/v1/raw/d4b19bd3-58e8-48b9-b81a-b037d4b863f914.webp");
        } else if ("conversation".equals(this.f127320q)) {
            this.f127315l.setText(String.format("%s们都不是你想聊天的类型？", CoreModule.f17545c.f19639e0.m169527p9().isFemale() ? "他" : "她"));
            this.f127316m.setText("选择你的理想型，为你推荐更多适合聊天的对象");
            qib0.f154691G.m102331L0(this.f127314k, "https://auto.tancdn.com/v1/raw/92b47530-df26-49e8-95bc-0357344850d314.webp");
        }
        zvf0.m220402x("e_save_ideal_type", m149241K());
        xdl0.m208329E0(this.f127318o, new View.OnClickListener() { // from class: l.fbm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f96735a.m149244O(view);
            }
        });
        xdl0.m208329E0(this.f127313j, new View.OnClickListener() { // from class: l.gbm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f101880a.m149245P(view);
            }
        });
        xdl0.m208329E0(this.f127311h, new View.OnClickListener() { // from class: l.hbm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f106945a.m149246Q(view);
            }
        });
        xdl0.m208329E0(this.f127312i, new View.OnClickListener() { // from class: l.ibm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                lbm.m149237D(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m149244O(View view) {
        if (vwb.m200296J(this.f127322s)) {
            return;
        }
        this.f127318o.setEnabled(false);
        this.f127318o.setText("正在保存");
        m149257V(this.f127322s);
        zvf0.m220396r("e_save_ideal_type", m149241K());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m149245P(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public /* synthetic */ void m149246Q(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m149247R(DialogInterface dialogInterface) {
        i0e.m133796e(this.f127321r);
    }

    /* JADX INFO: renamed from: H */
    public View m149250H(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return mbm.m153961b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: I */
    public final void m149251I() {
        this.f127322s = new ArrayList();
        for (int i = 0; i < this.f127317n.getChildCount(); i++) {
            if (this.f127317n.getChildAt(i).isSelected()) {
                this.f127322s.add((IdealTag) this.f127317n.getChildAt(i).getTag());
            }
        }
        this.f127318o.setEnabled(!vwb.m200296J(this.f127322s));
        this.f127318o.setText(vwb.m200296J(this.f127322s) ? "保存" : String.format("保存 (%d)", Integer.valueOf(this.f127322s.size())));
    }

    @SuppressLint({"ResourceAsColor"})
    /* JADX INFO: renamed from: J */
    public List<View> m149252J(List<IdealTag> list) {
        ArrayList arrayList = new ArrayList();
        for (IdealTag idealTag : list) {
            if (NullChecker.m81303a(idealTag)) {
                TextView textView = new TextView(getContext());
                textView.setBackgroundResource(x2c0.f189447J8);
                textView.setTextColor(e16.m114376d(getContext(), w0c0.f183810U0));
                int i = t100.f167264m;
                int i2 = t100.f167261j;
                textView.setPadding(i, i2, i, i2);
                textView.setText(idealTag.name);
                textView.setTextSize(14.0f);
                mji0.m154819m(textView, t100.m186890d(20.0f));
                textView.setTag(idealTag);
                textView.getPaint().setFakeBoldText(true);
                textView.setOnClickListener(new View.OnClickListener() { // from class: l.dbm
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f85326a.m149253N(view);
                    }
                });
                arrayList.add(textView);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m149253N(View view) {
        if ("正在保存".equals(this.f127318o.getText().toString())) {
            return;
        }
        view.setSelected(!view.isSelected());
        m149251I();
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m149254S(Boolean bool) {
        osi0.m165783g("已保存");
        dismiss();
        CoreModule.f17545c.f19663m0.m31133o8();
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m149255T(Throwable th) {
        m149251I();
    }

    /* JADX INFO: renamed from: U */
    public void m149256U(List<IdealTag> list, String str) {
        this.f127320q = str;
        if ("swipe".equals(str)) {
            this.f127321r.m109040p(vwb.m200311Y("add_ideal_timing", "continue_dislike"));
        } else if ("conversation".equals(str)) {
            this.f127321r.m109040p(vwb.m200311Y("add_ideal_timing", "no_match_to_chat"));
        }
        if (this.f127317n.getChildCount() > 0) {
            this.f127317n.removeAllViews();
        }
        this.f127317n.setTags(m149252J(list));
    }

    /* JADX INFO: renamed from: V */
    public final void m149257V(List<IdealTag> list) {
        this.f127319p.duringCreated(CoreModule.f17545c.f19639e0.m169544ta(list)).subscribe(mkd0.m154956H(new e30() { // from class: l.jbm
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f117199a.m149254S((Boolean) obj);
            }
        }, new e30() { // from class: l.kbm
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f122252a.m149255T((Throwable) obj);
            }
        }));
    }

    @Override // p149l.inf, android.app.Dialog
    public void show() {
        super.show();
        this.f127321r.m109040p(vwb.m200311Y("add_ideal_timing", "swipe".equals(this.f127320q) ? "continue_dislike" : "no_match_to_chat"), vwb.m200311Y("is_first_add_ideal", Boolean.TRUE));
        i0e.m133797f(this.f127321r);
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.ebm
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f90362a.m149247R(dialogInterface);
            }
        });
        m149243M();
    }
}

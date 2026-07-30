package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.profile.views.FlowTagsView;
import com.p051p1.mobile.putong.data.IdealTag;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes11.dex */
public class bem extends oof {

    /* JADX INFO: renamed from: h */
    public View f76389h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f76390i;

    /* JADX INFO: renamed from: j */
    public ImageView f76391j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f76392k;

    /* JADX INFO: renamed from: l */
    public TextView f76393l;

    /* JADX INFO: renamed from: m */
    public TextView f76394m;

    /* JADX INFO: renamed from: n */
    public FlowTagsView f76395n;

    /* JADX INFO: renamed from: o */
    public TextView f76396o;

    /* JADX INFO: renamed from: p */
    public Act f76397p;

    /* JADX INFO: renamed from: q */
    public String f76398q;

    /* JADX INFO: renamed from: r */
    public l4g0 f76399r;

    /* JADX INFO: renamed from: s */
    public List<IdealTag> f76400s;

    public bem(@NonNull Context context) {
        super(context);
        m103719L(context);
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m103714D(View view) {
    }

    /* JADX INFO: renamed from: K */
    private String m103718K() {
        return "p_add_ideal_type";
    }

    /* JADX INFO: renamed from: L */
    private void m103719L(Context context) {
        this.f76397p = (Act) bnl0.m105506D(context);
        setContentView(m103727H(LayoutInflater.from(context), null));
        setCancelable(false);
        if (this.f76399r == null) {
            this.f76399r = w1e.m204399c(m103718K(), bem.class.getSimpleName());
        }
    }

    /* JADX INFO: renamed from: M */
    private void m103720M() {
        if ("swipe".equals(this.f76398q)) {
            this.f76393l.setText("你想认识什么样的人？");
            this.f76394m.setText("选择你的理想型，我们会优先推荐你感兴趣的人");
            uqb0.f180374G.m127115L0(this.f76392k, "https://auto.tancdn.com/v1/raw/d4b19bd3-58e8-48b9-b81a-b037d4b863f914.webp");
        } else if ("conversation".equals(this.f76398q)) {
            this.f76393l.setText(String.format("%s们都不是你想聊天的类型？", CoreModule.f18264c.f20381e0.m116600p9().isFemale() ? "他" : "她"));
            this.f76394m.setText("选择你的理想型，为你推荐更多适合聊天的对象");
            uqb0.f180374G.m127115L0(this.f76392k, "https://auto.tancdn.com/v1/raw/92b47530-df26-49e8-95bc-0357344850d314.webp");
        }
        i4g0.m138526x("e_save_ideal_type", m103718K());
        bnl0.m105509E0(this.f76396o, new View.OnClickListener() { // from class: l.vdm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f183640a.m103721O(view);
            }
        });
        bnl0.m105509E0(this.f76391j, new View.OnClickListener() { // from class: l.wdm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f188621a.m103722P(view);
            }
        });
        bnl0.m105509E0(this.f76389h, new View.OnClickListener() { // from class: l.xdm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f193613a.m103723Q(view);
            }
        });
        bnl0.m105509E0(this.f76390i, new View.OnClickListener() { // from class: l.ydm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bem.m103714D(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m103721O(View view) {
        if (jyb.m147479J(this.f76400s)) {
            return;
        }
        this.f76396o.setEnabled(false);
        this.f76396o.setText("正在保存");
        m103734V(this.f76400s);
        i4g0.m138520r("e_save_ideal_type", m103718K());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m103722P(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public /* synthetic */ void m103723Q(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m103724R(DialogInterface dialogInterface) {
        w1e.m204401e(this.f76399r);
    }

    /* JADX INFO: renamed from: H */
    public View m103727H(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return cem.m109379b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: I */
    public final void m103728I() {
        this.f76400s = new ArrayList();
        for (int i = 0; i < this.f76395n.getChildCount(); i++) {
            if (this.f76395n.getChildAt(i).isSelected()) {
                this.f76400s.add((IdealTag) this.f76395n.getChildAt(i).getTag());
            }
        }
        this.f76396o.setEnabled(!jyb.m147479J(this.f76400s));
        this.f76396o.setText(jyb.m147479J(this.f76400s) ? "保存" : String.format("保存 (%d)", Integer.valueOf(this.f76400s.size())));
    }

    @SuppressLint({"ResourceAsColor"})
    /* JADX INFO: renamed from: J */
    public List<View> m103729J(List<IdealTag> list) {
        ArrayList arrayList = new ArrayList();
        for (IdealTag idealTag : list) {
            if (NullChecker.m82486a(idealTag)) {
                TextView textView = new TextView(getContext());
                textView.setBackgroundResource(dbc0.f86305K8);
                textView.setTextColor(j26.m143191d(getContext(), c9c0.f80382V0));
                int i = qa00.f156326m;
                int i2 = qa00.f156323j;
                textView.setPadding(i, i2, i, i2);
                textView.setText(idealTag.name);
                textView.setTextSize(14.0f);
                msi0.m159815m(textView, qa00.m175859d(20.0f));
                textView.setTag(idealTag);
                textView.getPaint().setFakeBoldText(true);
                textView.setOnClickListener(new View.OnClickListener() { // from class: l.tdm
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f173373a.m103730N(view);
                    }
                });
                arrayList.add(textView);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m103730N(View view) {
        if ("正在保存".equals(this.f76396o.getText().toString())) {
            return;
        }
        view.setSelected(!view.isSelected());
        m103728I();
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m103731S(Boolean bool) {
        r1j0.m179420g("已保存");
        dismiss();
        CoreModule.f18264c.f20405m0.m32136o8();
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m103732T(Throwable th) {
        m103728I();
    }

    /* JADX INFO: renamed from: U */
    public void m103733U(List<IdealTag> list, String str) {
        this.f76398q = str;
        if ("swipe".equals(str)) {
            this.f76399r.m152781p(jyb.m147494Y("add_ideal_timing", "continue_dislike"));
        } else if ("conversation".equals(str)) {
            this.f76399r.m152781p(jyb.m147494Y("add_ideal_timing", "no_match_to_chat"));
        }
        if (this.f76395n.getChildCount() > 0) {
            this.f76395n.removeAllViews();
        }
        this.f76395n.setTags(m103729J(list));
    }

    /* JADX INFO: renamed from: V */
    public final void m103734V(List<IdealTag> list) {
        this.f76397p.duringCreated(CoreModule.f18264c.f20381e0.m116617ta(list)).subscribe(psd0.m173597H(new y20() { // from class: l.zdm
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f203893a.m103731S((Boolean) obj);
            }
        }, new y20() { // from class: l.aem
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f70813a.m103732T((Throwable) obj);
            }
        }));
    }

    @Override // p153l.oof, android.app.Dialog
    public void show() {
        super.show();
        this.f76399r.m152781p(jyb.m147494Y("add_ideal_timing", "swipe".equals(this.f76398q) ? "continue_dislike" : "no_match_to_chat"), jyb.m147494Y("is_first_add_ideal", Boolean.TRUE));
        w1e.m204402f(this.f76399r);
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.udm
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f178553a.m103724R(dialogInterface);
            }
        });
        m103720M();
    }
}

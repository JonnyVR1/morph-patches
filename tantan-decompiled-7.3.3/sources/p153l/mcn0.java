package p153l;

import android.content.Context;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.feed.data.MomentAllowForwardState;

/* JADX INFO: loaded from: classes9.dex */
public class mcn0 extends jbt {

    /* JADX INFO: renamed from: d */
    public TextView f135827d;

    /* JADX INFO: renamed from: e */
    public TextView f135828e;

    /* JADX INFO: renamed from: f */
    public TextView f135829f;

    /* JADX INFO: renamed from: g */
    public TextView f135830g;

    /* JADX INFO: renamed from: h */
    public Act f135831h;

    /* JADX INFO: renamed from: i */
    public x20 f135832i;

    /* JADX INFO: renamed from: l.mcn0$a */
    public class C18586a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String[] f135833a;

        public C18586a(String[] strArr) {
            this.f135833a = strArr;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NonNull View view) {
            nae0.m162083m(mcn0.this.f135831h, Uri.parse(this.f135833a[1]));
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setColor(mcn0.this.f135831h.getResources().getColor(m9c0.f135390o));
            textPaint.setUnderlineText(false);
        }
    }

    public mcn0(@NonNull Context context, x20 x20Var) {
        super(context, LayoutInflater.from(context).inflate(xec0.f193880j2, (ViewGroup) null));
        this.f135832i = x20Var;
        m157922A();
    }

    /* JADX INFO: renamed from: A */
    private void m157922A() {
        m157930z(m144329u());
        bnl0.m105509E0(this.f135829f, new View.OnClickListener() { // from class: l.kcn0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f125080a.m157923C(view);
            }
        });
        this.f135830g.setOnClickListener(new View.OnClickListener() { // from class: l.lcn0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f131369a.m157924D(view);
            }
        });
        if (wft.m206159b(3)) {
            this.f135827d.setText("群主须知");
            this.f135828e.setText("1、群主应当履行对群里的监督管理职责，严格依据相关法律法规、实时群聊社区规范等相关规定闺房群聊成员的行为和信息发布；\n2、群主应当积极维护群内的聊天只需，营造良好的交流氛围，提供积极健康的聊天话题，并且及时处理群成员之间的矛盾，维护群聊的安全、健康，保证群成员的使用体验。");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public /* synthetic */ void m157923C(View view) {
        x20 x20Var = this.f135832i;
        if (x20Var == null) {
            tbs.f172993f.m143700b(this.f135831h, null);
        } else {
            x20Var.call();
        }
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public /* synthetic */ void m157924D(View view) {
        dismiss();
    }

    /* JADX INFO: renamed from: F */
    public static void m157925F(Act act, String str, x20 x20Var) {
        String strM137760b = hyn0.m137760b(100019);
        fhw.m125605a("EnterRoomChecker", "isInterceptStartVoiceLives");
        if (MomentAllowForwardState.allow.equals(strM137760b)) {
            mcn0 mcn0Var = new mcn0(act, x20Var);
            mcn0Var.f135831h = act;
            mcn0Var.m157929E(str);
            if (mcn0Var.isShowing()) {
                return;
            }
            mcn0Var.show();
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m157929E(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String[] strArrSplit = str.split("#");
        if (strArrSplit.length > 0) {
            spannableStringBuilder.append((CharSequence) strArrSplit[0]);
        }
        if (strArrSplit.length > 2) {
            spannableStringBuilder.append((CharSequence) strArrSplit[2]);
            spannableStringBuilder.setSpan(new C18586a(strArrSplit), strArrSplit[0].length(), strArrSplit[0].length() + strArrSplit[2].length(), 33);
        }
        if (strArrSplit.length > 3) {
            spannableStringBuilder.append((CharSequence) strArrSplit[3]);
        }
        this.f135828e.setText(spannableStringBuilder);
        this.f135828e.setMovementMethod(LinkMovementMethod.getInstance());
        this.f135828e.setHighlightColor(0);
    }

    @Override // p153l.jbt, android.app.Dialog
    public void onStart() {
        super.onStart();
    }

    /* JADX INFO: renamed from: z */
    public final void m157930z(View view) {
        ncn0.m162583a(this, view);
    }
}

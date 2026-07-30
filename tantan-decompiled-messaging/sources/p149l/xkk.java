package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.ChatGroup;
import com.p046p1.mobile.putong.core.data.JoinCondition;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import p147v.VFrame;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class xkk implements s7m<tkk> {

    /* JADX INFO: renamed from: a */
    public VLinear f193313a;

    /* JADX INFO: renamed from: b */
    public VFrame f193314b;

    /* JADX INFO: renamed from: c */
    public VFrame f193315c;

    /* JADX INFO: renamed from: d */
    public VText f193316d;

    /* JADX INFO: renamed from: e */
    public VFrame f193317e;

    /* JADX INFO: renamed from: f */
    public Act f193318f;

    /* JADX INFO: renamed from: g */
    public tkk f193319g;

    /* JADX INFO: renamed from: l.xkk$a */
    public static class C21165a {
        /* JADX INFO: renamed from: b */
        public static void m209809b(xkk xkkVar, View view) {
            xkkVar.f193313a = (VLinear) view;
            ViewGroup viewGroup = (ViewGroup) view;
            xkkVar.f193314b = (VFrame) viewGroup.getChildAt(0);
            xkkVar.f193315c = (VFrame) viewGroup.getChildAt(1);
            xkkVar.f193316d = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
            xkkVar.f193317e = (VFrame) viewGroup.getChildAt(2);
        }

        /* JADX INFO: renamed from: c */
        public static View m209810c(xkk xkkVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(l6c0.f126607z0, viewGroup, false);
            m209809b(xkkVar, viewInflate);
            return viewInflate;
        }
    }

    public xkk(Act act) {
        this.f193318f = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m209802n(View view) {
        this.f193319g.m189499r0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m209803q(View view) {
        this.f193319g.m189493l0();
    }

    @Override // p149l.s7m
    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f193318f;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m209804k(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public View m209804k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C21165a.m209810c(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(tkk tkkVar) {
        this.f193319g = tkkVar;
    }

    /* JADX INFO: renamed from: m */
    public void m209806m(final ChatGroup chatGroup) {
        xdl0.m208329E0(this.f193314b, new View.OnClickListener() { // from class: l.ukk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f176941a.m209802n(view);
            }
        });
        xdl0.m208329E0(this.f193315c, new View.OnClickListener() { // from class: l.vkk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f181822a.m209807p(chatGroup, view);
            }
        });
        xdl0.m208329E0(this.f193317e, new View.OnClickListener() { // from class: l.wkk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f186781a.m209803q(view);
            }
        });
        xdl0.m208344M(this.f193317e, false);
        if (TEnum.equals(chatGroup.joinCondition, JoinCondition.noApplyRequired)) {
            this.f193316d.setText(R$string.f21125y0);
        } else if (TEnum.equals(chatGroup.joinCondition, JoinCondition.applyRequired)) {
            this.f193316d.setText(R$string.f21133z0);
        }
        xdl0.m208344M(this.f193315c, chatGroup.permissions.canChangeJoinCondition);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m209807p(ChatGroup chatGroup, View view) {
        this.f193319g.m189494m0(chatGroup);
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}

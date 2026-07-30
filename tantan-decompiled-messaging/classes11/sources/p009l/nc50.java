package p009l;

import android.text.TextUtils;
import android.view.View;
import com.p000p1.mobile.putong.oms.OmsBaseRender;
import com.p000p1.mobile.putong.p004ui.oms.OmsPageAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.data.OMSDialogInfo;
import com.p1.mobile.putong.data.tenum.TEnum;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class nc50 {

    /* JADX INFO: renamed from: d */
    public static nc50 f17396d;

    /* JADX INFO: renamed from: a */
    public HashMap<String, C1047a> f17397a = new HashMap<>();

    /* JADX INFO: renamed from: b */
    public ArrayList<zuj0> f17398b = new ArrayList<>();

    /* JADX INFO: renamed from: c */
    public Stack<OmsBaseRender> f17399c = new Stack<>();

    /* JADX INFO: renamed from: l.nc50$a */
    public static class C1047a {

        /* JADX INFO: renamed from: a */
        public View f17400a;

        /* JADX INFO: renamed from: b */
        public WeakReference<PutongAct> f17401b;
    }

    /* JADX INFO: renamed from: f */
    public static nc50 m18839f() {
        if (f17396d == null) {
            synchronized (nc50.class) {
                try {
                    if (f17396d == null) {
                        f17396d = new nc50();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f17396d;
    }

    /* JADX INFO: renamed from: a */
    public PutongAct m18840a(String str) {
        if (this.f17397a.get(str).f17401b == null) {
            return null;
        }
        return this.f17397a.get(str).f17401b.get();
    }

    /* JADX INFO: renamed from: b */
    public List<zuj0> m18841b() {
        return this.f17398b;
    }

    /* JADX INFO: renamed from: c */
    public void m18842c() {
        this.f17398b.clear();
    }

    /* JADX INFO: renamed from: d */
    public boolean m18843d(String str) {
        return this.f17397a.containsKey(str);
    }

    /* JADX INFO: renamed from: e */
    public View m18844e(String str) {
        return this.f17397a.get(str).f17400a;
    }

    /* JADX INFO: renamed from: g */
    public OmsBaseRender m18845g(String str) {
        for (OmsBaseRender omsBaseRender : this.f17399c) {
            if (TextUtils.equals(omsBaseRender.f7828b.identifier, str)) {
                return omsBaseRender;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public OmsBaseRender m18846h() {
        if (this.f17399c.isEmpty()) {
            return null;
        }
        return this.f17399c.peek();
    }

    /* JADX INFO: renamed from: i */
    public OmsBaseRender m18847i() {
        if (this.f17399c.isEmpty()) {
            return null;
        }
        return this.f17399c.pop();
    }

    /* JADX INFO: renamed from: j */
    public void m18848j(OmsBaseRender omsBaseRender) {
        this.f17399c.push(omsBaseRender);
    }

    /* JADX INFO: renamed from: k */
    public void m18849k(List<zuj0> list) {
        this.f17398b.addAll(list);
    }

    /* JADX INFO: renamed from: l */
    public void m18850l(String str) {
        this.f17397a.remove(str);
    }

    /* JADX INFO: renamed from: m */
    public void m18851m(String str, PutongAct putongAct) {
        this.f17397a.get(str).f17401b = new WeakReference<>(putongAct);
    }

    /* JADX INFO: renamed from: n */
    public boolean m18852n(Act act, OMSDialogInfo oMSDialogInfo) {
        OmsBaseRender omsBaseRender = new OmsBaseRender(act, oMSDialogInfo);
        if (oMSDialogInfo != null && TEnum.equals(oMSDialogInfo.contentType, "morph")) {
            omsBaseRender.m9577R();
            if (omsBaseRender.f7835i != null && !omsBaseRender.f7834h) {
                if (!TEnum.equals(oMSDialogInfo.content.morph.baseStyle, "fullScreen")) {
                    omsBaseRender.m9588c0();
                    return true;
                }
                C1047a c1047a = new C1047a();
                c1047a.f17400a = omsBaseRender.f7835i;
                this.f17397a.put(oMSDialogInfo.identifier, c1047a);
                omsBaseRender.f7836j = true;
                act.startActivity(OmsPageAct.m10203Y1(act, oMSDialogInfo.identifier, oMSDialogInfo.mercury, oMSDialogInfo.cancelAble));
                return true;
            }
        }
        return false;
    }
}

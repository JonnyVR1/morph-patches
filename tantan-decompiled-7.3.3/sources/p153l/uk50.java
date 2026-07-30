package p153l;

import android.text.TextUtils;
import android.view.View;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.data.OMSDialogInfo;
import com.p051p1.mobile.putong.data.OMSDialogType;
import com.p051p1.mobile.putong.data.OMSMorphBaseStyle;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.oms.OmsBaseRender;
import com.p051p1.mobile.putong.p070ui.oms.OmsPageAct;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

/* JADX INFO: loaded from: classes10.dex */
public class uk50 {

    /* JADX INFO: renamed from: d */
    public static uk50 f179361d;

    /* JADX INFO: renamed from: a */
    public HashMap<String, C20592a> f179362a = new HashMap<>();

    /* JADX INFO: renamed from: b */
    public ArrayList<c4k0> f179363b = new ArrayList<>();

    /* JADX INFO: renamed from: c */
    public Stack<OmsBaseRender> f179364c = new Stack<>();

    /* JADX INFO: renamed from: l.uk50$a */
    public static class C20592a {

        /* JADX INFO: renamed from: a */
        public View f179365a;

        /* JADX INFO: renamed from: b */
        public WeakReference<PutongAct> f179366b;
    }

    /* JADX INFO: renamed from: f */
    public static uk50 m196472f() {
        if (f179361d == null) {
            synchronized (uk50.class) {
                try {
                    if (f179361d == null) {
                        f179361d = new uk50();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f179361d;
    }

    /* JADX INFO: renamed from: a */
    public PutongAct m196473a(String str) {
        if (this.f179362a.get(str).f179366b == null) {
            return null;
        }
        return this.f179362a.get(str).f179366b.get();
    }

    /* JADX INFO: renamed from: b */
    public List<c4k0> m196474b() {
        return this.f179363b;
    }

    /* JADX INFO: renamed from: c */
    public void m196475c() {
        this.f179363b.clear();
    }

    /* JADX INFO: renamed from: d */
    public boolean m196476d(String str) {
        return this.f179362a.containsKey(str);
    }

    /* JADX INFO: renamed from: e */
    public View m196477e(String str) {
        return this.f179362a.get(str).f179365a;
    }

    /* JADX INFO: renamed from: g */
    public OmsBaseRender m196478g(String str) {
        for (OmsBaseRender omsBaseRender : this.f179364c) {
            if (TextUtils.equals(omsBaseRender.f55070b.identifier, str)) {
                return omsBaseRender;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public OmsBaseRender m196479h() {
        if (this.f179364c.isEmpty()) {
            return null;
        }
        return this.f179364c.peek();
    }

    /* JADX INFO: renamed from: i */
    public OmsBaseRender m196480i() {
        if (this.f179364c.isEmpty()) {
            return null;
        }
        return this.f179364c.pop();
    }

    /* JADX INFO: renamed from: j */
    public void m196481j(OmsBaseRender omsBaseRender) {
        this.f179364c.push(omsBaseRender);
    }

    /* JADX INFO: renamed from: k */
    public void m196482k(List<c4k0> list) {
        this.f179363b.addAll(list);
    }

    /* JADX INFO: renamed from: l */
    public void m196483l(String str) {
        this.f179362a.remove(str);
    }

    /* JADX INFO: renamed from: m */
    public void m196484m(String str, PutongAct putongAct) {
        this.f179362a.get(str).f179366b = new WeakReference<>(putongAct);
    }

    /* JADX INFO: renamed from: n */
    public boolean m196485n(Act act, OMSDialogInfo oMSDialogInfo) {
        OmsBaseRender omsBaseRender = new OmsBaseRender(act, oMSDialogInfo);
        if (oMSDialogInfo != null && TEnum.equals(oMSDialogInfo.contentType, OMSDialogType.morph)) {
            omsBaseRender.m80441R();
            if (omsBaseRender.f55077i != null && !omsBaseRender.f55076h) {
                if (!TEnum.equals(oMSDialogInfo.content.morph.baseStyle, OMSMorphBaseStyle.fullScreen)) {
                    omsBaseRender.m80452c0();
                    return true;
                }
                C20592a c20592a = new C20592a();
                c20592a.f179365a = omsBaseRender.f55077i;
                this.f179362a.put(oMSDialogInfo.identifier, c20592a);
                omsBaseRender.f55078j = true;
                act.startActivity(OmsPageAct.m81057Z1(act, oMSDialogInfo.identifier, oMSDialogInfo.mercury, oMSDialogInfo.cancelAble));
                return true;
            }
        }
        return false;
    }
}

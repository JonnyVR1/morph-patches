package tech.sud.gip.asr.base;

import android.text.TextUtils;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l.cbg0;
import l.ccg0;
import l.jog0;
import l.kjg0;
import l.xlg0;
import l.yfg0;
import org.json.JSONArray;
import org.json.JSONObject;
import org.spongycastle.i18n.TextBundle;
import tech.sud.gip.asr.base.model.InitASRParamModel;
import tech.sud.gip.core.ISudFSTAPP;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class BaseRealSudASRImpl implements Sudtry {
    private static final String FILE_TAG = "BaseRealSudASRImpl";
    private kjg0 _matchASRInfoEvent;
    protected final InitASRParamModel _paramModel;
    protected boolean isIntentRunning;
    protected String mLanguage;
    protected yfg0 mgCommonGameASR;
    private final String _TAG = "SudGIP ".concat(getClass().getSimpleName());
    protected HashSet<String> hitKeywordSet = new HashSet<>();

    public BaseRealSudASRImpl(InitASRParamModel initASRParamModel) {
        this._paramModel = initASRParamModel;
    }

    private void numberConver(String str, yfg0 yfg0Var) {
        Matcher matcher = Pattern.compile("[0-9]+").matcher(str);
        ArrayList arrayList = new ArrayList();
        while (matcher.find()) {
            try {
                arrayList.add(Integer.valueOf(matcher.group()));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (arrayList.size() > 0) {
            notifyAppCommonSelfTextHit(false, null, null, yfg0Var.d, null, arrayList);
        }
    }

    private void numberMatch(String str, yfg0 yfg0Var) {
        BaseRealSudASRImpl baseRealSudASRImpl;
        ArrayList arrayList;
        ArrayList arrayList2 = yfg0Var.b;
        if (arrayList2 == null || arrayList2.size() == 0) {
            return;
        }
        ArrayList arrayList3 = yfg0Var.b;
        int size = arrayList3.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            String str2 = (String) arrayList3.get(i2);
            if (str2 == null || !str.contains(str2)) {
                baseRealSudASRImpl = this;
            } else {
                this.hitKeywordSet.add(str2);
                ArrayList arrayList4 = new ArrayList();
                arrayList4.add(str2);
                try {
                    int i4 = Integer.parseInt(str2);
                    arrayList = new ArrayList();
                    arrayList.add(Integer.valueOf(i4));
                } catch (Exception e) {
                    e.printStackTrace();
                    arrayList = null;
                }
                baseRealSudASRImpl = this;
                baseRealSudASRImpl.notifyAppCommonSelfTextHit(true, str2, null, yfg0Var.d, arrayList4, arrayList);
            }
            i2 = i3;
            this = baseRealSudASRImpl;
        }
        BaseRealSudASRImpl baseRealSudASRImpl2 = this;
        ArrayList arrayList5 = yfg0Var.b;
        int size2 = arrayList5.size();
        while (i < size2) {
            Object obj = arrayList5.get(i);
            i++;
            if (!baseRealSudASRImpl2.hitKeywordSet.contains((String) obj)) {
                return;
            }
        }
        baseRealSudASRImpl2.stopASR(true);
    }

    private void textMatch(String str, yfg0 yfg0Var) {
        BaseRealSudASRImpl baseRealSudASRImpl;
        ArrayList arrayList = yfg0Var.b;
        if (arrayList == null || arrayList.size() == 0 || str == null) {
            return;
        }
        String lowerCase = str.toLowerCase(Locale.getDefault());
        ArrayList arrayList2 = yfg0Var.b;
        int size = arrayList2.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            String str2 = (String) obj;
            if (str2 == null || !lowerCase.contains(str2.toLowerCase(Locale.getDefault()))) {
                baseRealSudASRImpl = this;
            } else {
                this.hitKeywordSet.add(str2);
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(str2);
                baseRealSudASRImpl = this;
                baseRealSudASRImpl.notifyAppCommonSelfTextHit(true, str2, null, yfg0Var.d, arrayList3, null);
            }
            this = baseRealSudASRImpl;
        }
        BaseRealSudASRImpl baseRealSudASRImpl2 = this;
        ArrayList arrayList4 = yfg0Var.b;
        int size2 = arrayList4.size();
        while (i < size2) {
            Object obj2 = arrayList4.get(i);
            i++;
            if (!baseRealSudASRImpl2.hitKeywordSet.contains((String) obj2)) {
                return;
            }
        }
        baseRealSudASRImpl2.stopASR(true);
    }

    public void displayException(Exception exc) {
        LogUtils.file(FILE_TAG, "displayException:" + LogUtils.getErrorInfo(exc));
        SudLogger.m10034e(this._TAG, exc.getMessage() + System.lineSeparator() + TextUtils.join(System.lineSeparator(), exc.getStackTrace()));
    }

    @Override // tech.sud.gip.asr.base.Sudtry
    public void handleGameASR(String str) {
        LogUtils.file(FILE_TAG, "handleGameASR:" + str);
        SudLogger.m10032d(this._TAG, "handleGameASR:" + str);
        if (TextUtils.isEmpty(str)) {
            this.mgCommonGameASR = null;
            stopASR(false);
            return;
        }
        yfg0 yfg0VarA = yfg0.a(str);
        this.mgCommonGameASR = yfg0VarA;
        if (yfg0VarA == null) {
            stopASR(false);
            return;
        }
        if (!yfg0VarA.a) {
            this.isIntentRunning = false;
            stopASR(true);
            return;
        }
        if (!isSupportWordType(yfg0VarA.d)) {
            SudLogger.m10032d(this._TAG, "handleGameASR nonsupport:" + yfg0VarA.d);
            LogUtils.file(FILE_TAG, "handleGameASR nonsupport:" + yfg0VarA.d);
            return;
        }
        if (TextBundle.TEXT_ENTRY.equals(yfg0VarA.d) && !isValidLanguage(this._paramModel.supportTextLanguageList, yfg0VarA.c)) {
            SudLogger.m10032d(this._TAG, "handleGameASR nonsupport:" + yfg0VarA.c);
            LogUtils.file(FILE_TAG, "handleGameASR nonsupport:" + yfg0VarA.c);
            return;
        }
        if (!"number".equals(yfg0VarA.d) || isValidLanguage(this._paramModel.supportNumberLanguageList, yfg0VarA.c)) {
            this.isIntentRunning = true;
            String str2 = yfg0VarA.c;
            this.mLanguage = str2;
            startASR(str2);
            return;
        }
        SudLogger.m10032d(this._TAG, "handleGameASR nonsupport:" + yfg0VarA.c);
        LogUtils.file(FILE_TAG, "handleGameASR nonsupport:" + yfg0VarA.c);
    }

    public boolean isSupportWordType(String str) {
        return TextBundle.TEXT_ENTRY.equals(str) || "number".equals(str);
    }

    public boolean isValidLanguage(JSONArray jSONArray, String str) {
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                String string = jSONArray.getString(i);
                if (string != null && !string.isEmpty() && string.equals(str)) {
                    return true;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public void notifyAppCommonSelfTextHit(boolean z, String str, String str2, String str3, List<String> list, List<Integer> list2) {
        ccg0 ccg0Var = new ccg0();
        ccg0Var.a = z;
        ccg0Var.b = str;
        ccg0Var.c = str2;
        ccg0Var.d = str3;
        ccg0Var.e = list;
        ccg0Var.f = list2;
        ISudFSTAPP iSudFSTAPP = this._paramModel.iSudFSTAPP.get();
        if (iSudFSTAPP != null) {
            iSudFSTAPP.notifyStateChange("app_common_self_text_hit", ccg0Var.a(), null);
            SudLogger.m10032d(this._TAG, "hit:" + ccg0Var.a());
            LogUtils.file(FILE_TAG, "hit:" + ccg0Var.a());
        }
    }

    public void onRecognizingResult(String str) {
        yfg0 yfg0Var;
        jog0 jog0Var = this._matchASRInfoEvent;
        if (jog0Var != null) {
            jog0 jog0Var2 = jog0Var;
            if (!jog0Var2.d.booleanValue()) {
                jog0Var2.d = Boolean.TRUE;
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(IjkMediaMeta.IJKM_KEY_TYPE, jog0Var2.a);
                    jSONObject.put("date", jog0Var2.c);
                    jog0Var2.b.j.put("matchASR", jSONObject);
                    xlg0.b(jog0Var2.b);
                    cbg0.a("TechSudMGPGlobal.sp").c("key_sud_mgp_match_asr_last_date", jog0Var2.c, false);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        if (TextUtils.isEmpty(str) || (yfg0Var = this.mgCommonGameASR) == null || !yfg0Var.a) {
            return;
        }
        if (TextBundle.TEXT_ENTRY.equals(yfg0Var.d)) {
            if (yfg0Var.e) {
                textMatch(str, yfg0Var);
            }
            if (yfg0Var.f) {
                notifyAppCommonSelfTextHit(false, null, str, yfg0Var.d, null, null);
                return;
            }
            return;
        }
        if ("number".equals(yfg0Var.d)) {
            if (yfg0Var.e) {
                numberMatch(str, yfg0Var);
            }
            if (yfg0Var.f) {
                numberConver(str, yfg0Var);
            }
        }
    }

    @Override // tech.sud.gip.asr.base.Sudtry
    public abstract /* synthetic */ void pushAudio(ByteBuffer byteBuffer, int i);

    public void setMatchASREvent(kjg0 kjg0Var) {
        this._matchASRInfoEvent = kjg0Var;
    }

    public void startASR(String str) {
        this.hitKeywordSet.clear();
    }

    @Override // tech.sud.gip.asr.base.Sudtry
    public void stopASR(boolean z) {
        if (z) {
            this.isIntentRunning = false;
        }
        this.hitKeywordSet.clear();
    }
}

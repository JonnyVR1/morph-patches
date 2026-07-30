package p149l;

import com.p046p1.mobile.putong.core.data.IceBreakingQuestion;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class gu4 {
    /* JADX INFO: renamed from: a */
    public static void m128024a(List<IceBreakingQuestion> list) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            int i = 0;
            while (i < list.size()) {
                IceBreakingQuestion iceBreakingQuestion = list.get(i);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("id", iceBreakingQuestion.f20420id);
                jSONObject3.put("content", iceBreakingQuestion.content);
                i++;
                jSONObject2.put(String.valueOf(i), jSONObject3);
            }
            jSONObject.put("chat_topics", jSONObject2);
        } catch (Exception unused) {
        }
        zvf0.m220404z("e_opposite_topic", OMSDialogPositon.p_chat_view, jSONObject);
    }

    /* JADX INFO: renamed from: b */
    public static void m128025b(String str, IceBreakingQuestion iceBreakingQuestion) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("id", iceBreakingQuestion.f20420id);
            jSONObject3.put("content", iceBreakingQuestion.content);
            jSONObject2.put(str, jSONObject3);
            jSONObject.put("chat_topics", jSONObject2);
        } catch (JSONException unused) {
        }
        zvf0.m220398t("e_opposite_topic", OMSDialogPositon.p_chat_view, jSONObject);
    }

    /* JADX INFO: renamed from: c */
    public static void m128026c(String str, List<IceBreakingQuestion> list) {
        try {
            JSONObject jSONObject = new JSONObject();
            int i = 0;
            while (i < list.size()) {
                IceBreakingQuestion iceBreakingQuestion = list.get(i);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("id", iceBreakingQuestion.f20420id);
                jSONObject2.put("content", iceBreakingQuestion.content);
                i++;
                jSONObject.put(String.valueOf(i), jSONObject2);
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("chat_topics", jSONObject);
            zvf0.m220398t("e_save_topic", str, jSONObject3);
        } catch (Exception unused) {
        }
    }
}

package p149l;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class k8n {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ int m144946a(String str, int i) {
        if (str.length() > 1 && str.charAt(0) == '+') {
            str = str.substring(1);
        }
        long j = Long.parseLong(str, i);
        if ((4294967295L & j) == j) {
            return (int) j;
        }
        throw new NumberFormatException("Input " + str + " in base " + i + " is not in the range of an unsigned integer");
    }
}

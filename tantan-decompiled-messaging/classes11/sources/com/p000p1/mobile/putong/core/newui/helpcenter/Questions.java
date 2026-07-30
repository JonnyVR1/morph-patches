package com.p000p1.mobile.putong.core.newui.helpcenter;

import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.data.Gender;
import com.p1.mobile.putong.data.tenum.TEnum;
import java.io.Serializable;
import java.util.List;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class Questions {

    /* JADX INFO: renamed from: a */
    public static List<Question> f367a;

    public static class ImageContent extends AbstractC0018b implements Serializable {
        final CharSequence url;

        public ImageContent(CharSequence charSequence) {
            super(1);
            this.url = charSequence;
        }

        @Override // com.p000p1.mobile.putong.core.newui.helpcenter.Questions.AbstractC0018b
        public CharSequence getContent() {
            return this.url;
        }
    }

    public static class Question implements Serializable {
        private final List<AbstractC0018b> contents;

        /* JADX INFO: renamed from: id */
        private final String f368id;
        private final int titleResId;

        public Question(String str, int i, List<AbstractC0018b> list) {
            this.f368id = str;
            this.titleResId = i;
            this.contents = list;
        }

        public List<AbstractC0018b> getContents() {
            return this.contents;
        }

        public String getId() {
            return this.f368id;
        }

        public CharSequence getTitle() {
            return CoreModule.b.getText(this.titleResId);
        }
    }

    public static class TextContent extends AbstractC0018b implements Serializable {
        final int textResId;

        public TextContent(int i, int i2) {
            super(i);
            this.textResId = i2;
        }

        @Override // com.p000p1.mobile.putong.core.newui.helpcenter.Questions.AbstractC0018b
        public CharSequence getContent() {
            return CoreModule.b.getText(this.textResId);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.helpcenter.Questions$a */
    public static /* synthetic */ class C0017a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f369a;

        static {
            int[] iArr = new int[IntlCountryCodeController.ModelRegion.values().length];
            f369a = iArr;
            try {
                iArr[IntlCountryCodeController.ModelRegion.OTHER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f369a[IntlCountryCodeController.ModelRegion.EA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f369a[IntlCountryCodeController.ModelRegion.SEA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f369a[IntlCountryCodeController.ModelRegion.SA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.helpcenter.Questions$b */
    public static abstract class AbstractC0018b {
        public static final int TYPE_IMAGE = 1;
        public static final int TYPE_TEXT = 0;
        public static final int TYPE_TITLE = 2;
        final int type;

        public AbstractC0018b(int i) {
            this.type = i;
        }

        public static AbstractC0018b image(String str) {
            return new ImageContent(str);
        }

        public static AbstractC0018b text(int i) {
            return new TextContent(0, i);
        }

        public static AbstractC0018b title(int i) {
            return new TextContent(2, i);
        }

        public abstract CharSequence getContent();

        public int getType() {
            return this.type;
        }
    }

    static {
        int i = R.string.p7;
        Question question = new Question("how_to_use_tantan", i, vwb.f0(new AbstractC0018b[]{AbstractC0018b.title(i), AbstractC0018b.text(R.string.q7), AbstractC0018b.image("https://auto.tancdn.com/v1/images/eyJpZCI6IlFJQ0NKUVpXNEdRRFk2RFEzWlhSM0haU0MzN0NBTTA0IiwidyI6ODcyLCJoIjo2NzIsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo2NTY1NTE3Mzc4NTg2NDg2OTk3LCJhYiI6MH0.png?format=max_720xX"), AbstractC0018b.text(R.string.r7), AbstractC0018b.image("https://auto.tancdn.com/v1/images/eyJpZCI6IkdEV0JNVDdZN0dRTFMyRzIySTdKQTNTTTVYMzQ0WTA0IiwidyI6ODcyLCJoIjo2NzIsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyOTc0Mzc2MTY2NjEyOTk2OTUzLCJhYiI6MH0.png?format=max_720xX"), AbstractC0018b.text(R.string.s7), AbstractC0018b.image("https://auto.tancdn.com/v1/images/eyJpZCI6IlYyVEE2N0tZVUlNM0ZaVFROMkNQWllGQTRNQVg3SDA0IiwidyI6ODcyLCJoIjo2NzIsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo4NzI1NDg4Mzc5NTMzNjc3NDA1LCJhYiI6MH0.png?format=max_720xX"), AbstractC0018b.text(R.string.t7)}));
        int i2 = R.string.f7;
        Question question2 = new Question("edit_profile", i2, vwb.f0(new AbstractC0018b[]{AbstractC0018b.title(i2), AbstractC0018b.text(R.string.g7)}));
        int i3 = R.string.w7;
        Question question3 = new Question("not_enough_swipe", i3, vwb.f0(new AbstractC0018b[]{AbstractC0018b.title(i3), AbstractC0018b.image("https://auto.tancdn.com/v1/images/eyJpZCI6IjRWRkVQUlZWTDJPSjJOREpJS00yMjdSRkVXNUhRVzA0IiwidyI6ODcyLCJoIjo2NzIsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozOTE0MjEwOTEyNjI3Mjc4NjgzLCJhYiI6MH0.png?format=max_720xX"), AbstractC0018b.text(R.string.x7), AbstractC0018b.text(R.string.y7)}));
        int i4 = R.string.h7;
        Question question4 = new Question("get_more_likes", i4, vwb.f0(new AbstractC0018b[]{AbstractC0018b.title(i4), AbstractC0018b.text(R.string.i7), AbstractC0018b.text(R.string.j7)}));
        int i5 = R.string.k7;
        Question question5 = new Question("get_more_matches", i5, vwb.f0(new AbstractC0018b[]{AbstractC0018b.title(i5), AbstractC0018b.text(R.string.l7), AbstractC0018b.image("https://auto.tancdn.com/v1/images/eyJpZCI6IjdISUxLWjNCVjVZT0VSQllTNlJOUDdBSzVGT1ZVSTA0IiwidyI6ODcyLCJoIjo2NzIsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo5MDQ3ODIyMjI5MzMyMzQzNTQsImFiIjowfQ.png?format=max_720xX"), AbstractC0018b.text(R.string.m7), AbstractC0018b.text(R.string.n7), AbstractC0018b.text(R.string.o7)}));
        int i6 = R.string.c7;
        Question question6 = new Question("break_the_ice", i6, vwb.f0(new AbstractC0018b[]{AbstractC0018b.title(i6), AbstractC0018b.text(R.string.d7), AbstractC0018b.text(R.string.e7)}));
        int i7 = R.string.Z6;
        Question question7 = new Question("harassment", i7, vwb.f0(new AbstractC0018b[]{AbstractC0018b.title(i7), AbstractC0018b.image("https://auto.tancdn.com/v1/images/eyJpZCI6IkZOSjZaUU80NDNHVFNaWTY2TkdJR0lYWUFXRFlLWjA0IiwidyI6ODcyLCJoIjo2NzIsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozNDg1MDM4NTk1NTgyNDIxMDI4LCJhYiI6MH0.png?format=max_720xX"), AbstractC0018b.text(R.string.a7), AbstractC0018b.text(R.string.b7)}));
        int i8 = R.string.u7;
        f367a = vwb.f0(new Question[]{question, question2, question3, question4, question5, question6, question7, new Question("missing_new_messages", i8, vwb.f0(new AbstractC0018b[]{AbstractC0018b.title(i8), AbstractC0018b.text(R.string.v7)}))});
    }

    /* JADX INFO: renamed from: a */
    public static List<Question> m580a() {
        return f367a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:103:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:104:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:109:0x0108  */
    /* JADX WARN: Code duplicated, block: B:111:0x010e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:113:0x0111 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:115:0x0114  */
    /* JADX WARN: Code duplicated, block: B:117:0x011a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:119:0x011d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:121:0x0120  */
    /* JADX WARN: Code duplicated, block: B:123:0x0126 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:125:0x0129 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:127:0x012c  */
    /* JADX WARN: Code duplicated, block: B:129:0x0132 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:131:0x0135 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:133:0x0138  */
    /* JADX WARN: Code duplicated, block: B:135:0x013e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:137:0x0141 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:139:0x0144  */
    /* JADX WARN: Code duplicated, block: B:141:0x014a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:143:0x014d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:181:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:80:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:83:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:87:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:88:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:91:0x00de  */
    /* JADX WARN: Code duplicated, block: B:93:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:95:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:96:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:99:0x00f2  */
    /* JADX WARN: Switch 'out' block B:93:0x00e2 for B:76:0x00b9 already processed. Defaulting to fallback option. */
    /* JADX INFO: renamed from: b */
    public static String m581b(String str, Gender gender) {
        if (str == null) {
            return null;
        }
        if (IntlCountryCodeController.v()) {
            switch (str) {
                case "https://auto.tancdn.com/v1/images/eyJpZCI6IlYyVEE2N0tZVUlNM0ZaVFROMkNQWllGQTRNQVg3SDA0IiwidyI6ODcyLCJoIjo2NzIsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo4NzI1NDg4Mzc5NTMzNjc3NDA1LCJhYiI6MH0.png?format=max_720xX":
                    return "http://auto.tancdn.com/v1/images/eyJpZCI6IjZWVUZITVJFSUNNQ05FQU9NNktXVzJIM1dRMlU3ViIsInciOjY3MCwiaCI6MzAwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6OTM0MDM3NDcyMzM0MjQyODQwOSwiYWIiOjB9.jpg?format=max_720xX";
                case "https://auto.tancdn.com/v1/images/eyJpZCI6IlFJQ0NKUVpXNEdRRFk2RFEzWlhSM0haU0MzN0NBTTA0IiwidyI6ODcyLCJoIjo2NzIsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo2NTY1NTE3Mzc4NTg2NDg2OTk3LCJhYiI6MH0.png?format=max_720xX":
                    return TEnum.equals(gender, "female") ? "http://auto.tancdn.com/v1/images/eyJpZCI6IlRTN040QkE2Q1NEVlhOQjRUTE8zNzI0SUhOTlpJTDA0IiwidyI6MTAwNSwiaCI6Nzc3LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MTIwMDY3Njc3NDI1Nzk5Mjc0OSwiYWIiOjB9.png?format=max_720xX" : "http://auto.tancdn.com/v1/images/eyJpZCI6IlEzR05XVFpKUUtaMlBaN1FWQzVaUEdSWUlRR1RIVjA0IiwidyI6MTAwNSwiaCI6Nzc3LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MjU3MjU5Njg3ODg3NTQ2ODg0OSwiYWIiOjB9.png?format=max_720xX";
                case "https://auto.tancdn.com/v1/images/eyJpZCI6IkdEV0JNVDdZN0dRTFMyRzIySTdKQTNTTTVYMzQ0WTA0IiwidyI6ODcyLCJoIjo2NzIsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyOTc0Mzc2MTY2NjEyOTk2OTUzLCJhYiI6MH0.png?format=max_720xX":
                    return TEnum.equals(gender, "female") ? "http://auto.tancdn.com/v1/images/eyJpZCI6IkVMUVhHN0YzNURVUVhLUERCSVpMT1RUUVI0TjJLSTA0IiwidyI6MTAwNSwiaCI6Nzc3LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MTI0MzQ3NzQxMDU0ODU4NDU1NDksImFiIjowfQ.png?format=max_720xX" : "http://auto.tancdn.com/v1/images/eyJpZCI6IlVHSjJPNVdZV0ZVVklFR0lQWVdYRjZLSVBMWlJOMzA0IiwidyI6MTAwNSwiaCI6Nzc3LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6ODMyNDA3MTgzNzE3NTAzMDgzMywiYWIiOjB9.png?format=max_720xX";
            }
        }
        int i = C0017a.f369a[IntlCountryCodeController.c().ordinal()];
        if (i == 1) {
            switch (str) {
                case "https://auto.tancdn.com/v1/images/eyJpZCI6IlYyVEE2N0tZVUlNM0ZaVFROMkNQWllGQTRNQVg3SDA0IiwidyI6ODcyLCJoIjo2NzIsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo4NzI1NDg4Mzc5NTMzNjc3NDA1LCJhYiI6MH0.png?format=max_720xX":
                    return TEnum.equals(gender, "female") ? "https://auto.tancdn.com/v1/images/eyJpZCI6IlYyVEE2N0tZVUlNM0ZaVFROMkNQWllGQTRNQVg3SDA0IiwidyI6ODcyLCJoIjo2NzIsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo4NzI1NDg4Mzc5NTMzNjc3NDA1LCJhYiI6MH0.png?format=max_720xX" : "https://auto.tancdn.com/v1/images/eyJpZCI6IkY2UlRQSkdNUzJXRE5BS1FHNE4zSVBDTVlMUU9VTDA0IiwidyI6ODcyLCJoIjo2NzIsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo4NzI1NDU5NjYzODUxNDQ3MTMzLCJhYiI6MH0.png?format=max_720xX";
                case "https://auto.tancdn.com/v1/images/eyJpZCI6IlFJQ0NKUVpXNEdRRFk2RFEzWlhSM0haU0MzN0NBTTA0IiwidyI6ODcyLCJoIjo2NzIsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo2NTY1NTE3Mzc4NTg2NDg2OTk3LCJhYiI6MH0.png?format=max_720xX":
                    return TEnum.equals(gender, "female") ? "https://auto.tancdn.com/v1/images/eyJpZCI6IlFJQ0NKUVpXNEdRRFk2RFEzWlhSM0haU0MzN0NBTTA0IiwidyI6ODcyLCJoIjo2NzIsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo2NTY1NTE3Mzc4NTg2NDg2OTk3LCJhYiI6MH0.png?format=max_720xX" : "https://auto.tancdn.com/v1/images/eyJpZCI6IjJQR1FUWjZPNFVYTFFCSDZKUjVSQVlTNkVTUDVEVTA0IiwidyI6ODcyLCJoIjo2NzIsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxOTUzNzc4NDQ3MTY3MzQ0NzgxLCJhYiI6MH0.png?format=max_720xX";
                case "https://auto.tancdn.com/v1/images/eyJpZCI6IkdEV0JNVDdZN0dRTFMyRzIySTdKQTNTTTVYMzQ0WTA0IiwidyI6ODcyLCJoIjo2NzIsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyOTc0Mzc2MTY2NjEyOTk2OTUzLCJhYiI6MH0.png?format=max_720xX":
                    return TEnum.equals(gender, "female") ? "https://auto.tancdn.com/v1/images/eyJpZCI6IkdEV0JNVDdZN0dRTFMyRzIySTdKQTNTTTVYMzQ0WTA0IiwidyI6ODcyLCJoIjo2NzIsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyOTc0Mzc2MTY2NjEyOTk2OTUzLCJhYiI6MH0.png?format=max_720xX" : "https://auto.tancdn.com/v1/images/eyJpZCI6IkxVUVkyVElYNkM0SU1YRjMyQk1ORlc1NDdWWUVNMzA0IiwidyI6ODcyLCJoIjo2NzIsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyOTc3NzQ5NDM0MjI4MzQ4MjQ3LCJhYiI6MH0.png?format=max_720xX";
            }
            switch (str) {
                case "https://auto.tancdn.com/v1/images/eyJpZCI6IlYyVEE2N0tZVUlNM0ZaVFROMkNQWllGQTRNQVg3SDA0IiwidyI6ODcyLCJoIjo2NzIsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo4NzI1NDg4Mzc5NTMzNjc3NDA1LCJhYiI6MH0.png?format=max_720xX":
                    if (TEnum.equals(gender, "female")) {
                        return "https://auto.tancdn.com/v1/images/eyJpZCI6IkRKUENRQlVMWkVJNVkzTU1IWk1VM0Y3UUhOQk5USDA0IiwidyI6ODcyLCJoIjo2NzIsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo4NzI1NDU3MjY3MDg2NTUxOTAxLCJhYiI6MH0.png?format=max_720xX";
                    }
                    return "https://auto.tancdn.com/v1/images/eyJpZCI6IlM2SU5XTjJGQkdZUTNXVEZLS1pYVFZNTFZWU0NZVzA0IiwidyI6ODcyLCJoIjo2NzIsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo4NzI1NDk0NjQxODk0NTc2OTkxLCJhYiI6MH0.png?format=max_720xX";
                case "https://auto.tancdn.com/v1/images/eyJpZCI6IlFJQ0NKUVpXNEdRRFk2RFEzWlhSM0haU0MzN0NBTTA0IiwidyI6ODcyLCJoIjo2NzIsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo2NTY1NTE3Mzc4NTg2NDg2OTk3LCJhYiI6MH0.png?format=max_720xX":
                    if (TEnum.equals(gender, "female")) {
                        return "https://auto.tancdn.com/v1/images/eyJpZCI6Ik5JT1lHVFZOU01LTlVYQkpHRkxUTzY1QVA3T0o0MjA0IiwidyI6ODcyLCJoIjo2NzIsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxOTUzNzc4NTE1NTQ5MDUwMDA5LCJhYiI6MH0.png?format=max_720xX";
                    }
                    return "https://auto.tancdn.com/v1/images/eyJpZCI6IjZQUVc2T09SR1BRRU1aNVk3WkxSSVRCRVlTR0xMRjA0IiwidyI6ODcyLCJoIjo2NzIsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo2NTY1NTE3MjQxMDE0MjM2MzEzLCJhYiI6MH0.png?format=max_720xX";
                case "https://auto.tancdn.com/v1/images/eyJpZCI6IkdEV0JNVDdZN0dRTFMyRzIySTdKQTNTTTVYMzQ0WTA0IiwidyI6ODcyLCJoIjo2NzIsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyOTc0Mzc2MTY2NjEyOTk2OTUzLCJhYiI6MH0.png?format=max_720xX":
                    if (TEnum.equals(gender, "female")) {
                        return "https://auto.tancdn.com/v1/images/eyJpZCI6Ilg3Q1E3REQzT1FUUlNETEQ2WlhRQUVZWVM3S01LQjA0IiwidyI6ODcyLCJoIjo2NzIsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyOTc0MzY5NjM4MzYzMjM3MjM3LCJhYiI6MH0.png?format=max_720xX";
                    }
                    return "https://auto.tancdn.com/v1/images/eyJpZCI6IlpISFpLUlBMVjVEQ0xSQlhQTjVHUlZES08yR0VLNjA0IiwidyI6ODcyLCJoIjo2NzIsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyOTc0MzcxNzQyNTk1NDkyNzIzLCJhYiI6MH0.png?format=max_720xX";
                default:
                    switch (str.hashCode()) {
                        case -1628155124:
                            if (!str.equals("https://auto.tancdn.com/v1/images/eyJpZCI6IlYyVEE2N0tZVUlNM0ZaVFROMkNQWllGQTRNQVg3SDA0IiwidyI6ODcyLCJoIjo2NzIsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo4NzI1NDg4Mzc5NTMzNjc3NDA1LCJhYiI6MH0.png?format=max_720xX")) {
                            }
                            break;
                        case -357830884:
                            if (str.equals("https://auto.tancdn.com/v1/images/eyJpZCI6IlFJQ0NKUVpXNEdRRFk2RFEzWlhSM0haU0MzN0NBTTA0IiwidyI6ODcyLCJoIjo2NzIsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo2NTY1NTE3Mzc4NTg2NDg2OTk3LCJhYiI6MH0.png?format=max_720xX")) {
                            }
                            break;
                        case 1031681537:
                            if (str.equals("https://auto.tancdn.com/v1/images/eyJpZCI6IkdEV0JNVDdZN0dRTFMyRzIySTdKQTNTTTVYMzQ0WTA0IiwidyI6ODcyLCJoIjo2NzIsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyOTc0Mzc2MTY2NjEyOTk2OTUzLCJhYiI6MH0.png?format=max_720xX")) {
                            }
                            break;
                        default:
                            break;
                    }
                    /*  JADX ERROR: Method code generation error
                        java.lang.NullPointerException: Switch insn not found in header
                        	at java.base/java.util.Objects.requireNonNull(Objects.java:246)
                        	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                        	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:267)
                        	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                        	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                        */
                    /*
                        Method dump skipped, instruction units count: 522
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p000p1.mobile.putong.core.newui.helpcenter.Questions.m581b(java.lang.String, com.p1.mobile.putong.data.Gender):java.lang.String");
                }
            }

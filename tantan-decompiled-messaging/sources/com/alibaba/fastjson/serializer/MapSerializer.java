package com.alibaba.fastjson.serializer;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public class MapSerializer extends SerializeFilterable implements ObjectSerializer {
    public static MapSerializer instance = new MapSerializer();
    private static final int NON_STRINGKEY_AS_STRING = SerializerFeature.m4802of(new SerializerFeature[]{SerializerFeature.BrowserCompatible, SerializerFeature.WriteNonStringKeyAsString, SerializerFeature.BrowserSecure});

    /* JADX WARN: Code duplicated, block: B:101:0x0150 A[Catch: all -> 0x0055, TryCatch #0 {all -> 0x0055, blocks: (B:28:0x0051, B:31:0x0058, B:33:0x0064, B:42:0x007f, B:44:0x0090, B:45:0x009c, B:47:0x00a2, B:49:0x00b4, B:52:0x00bc, B:55:0x00c1, B:57:0x00cb, B:59:0x00cf, B:62:0x00de, B:65:0x00e8, B:67:0x00ec, B:70:0x00f4, B:73:0x00f9, B:75:0x0103, B:77:0x0107, B:80:0x0112, B:83:0x011c, B:85:0x0120, B:88:0x0128, B:91:0x012d, B:93:0x0137, B:95:0x013b, B:98:0x0146, B:101:0x0150, B:103:0x0154, B:106:0x015c, B:109:0x0161, B:111:0x016b, B:113:0x016f, B:116:0x017b, B:119:0x0186, B:121:0x018a, B:124:0x0192, B:127:0x0197, B:129:0x01a1, B:131:0x01a5, B:132:0x01ae, B:133:0x01b4, B:135:0x01b8, B:138:0x01c0, B:141:0x01c5, B:143:0x01cf, B:145:0x01d3, B:146:0x01dc, B:165:0x0225, B:168:0x0237, B:170:0x023d, B:172:0x0242, B:173:0x0245, B:175:0x024d, B:176:0x0250, B:189:0x027f, B:190:0x028b, B:192:0x0291, B:193:0x0296, B:199:0x02a8, B:201:0x02b3, B:207:0x02cb, B:178:0x0256, B:179:0x0259, B:181:0x0261, B:186:0x0275, B:187:0x0278, B:183:0x0269, B:185:0x026d, B:163:0x021e, B:39:0x0078), top: B:220:0x0051 }] */
    /* JADX WARN: Code duplicated, block: B:103:0x0154 A[Catch: all -> 0x0055, TryCatch #0 {all -> 0x0055, blocks: (B:28:0x0051, B:31:0x0058, B:33:0x0064, B:42:0x007f, B:44:0x0090, B:45:0x009c, B:47:0x00a2, B:49:0x00b4, B:52:0x00bc, B:55:0x00c1, B:57:0x00cb, B:59:0x00cf, B:62:0x00de, B:65:0x00e8, B:67:0x00ec, B:70:0x00f4, B:73:0x00f9, B:75:0x0103, B:77:0x0107, B:80:0x0112, B:83:0x011c, B:85:0x0120, B:88:0x0128, B:91:0x012d, B:93:0x0137, B:95:0x013b, B:98:0x0146, B:101:0x0150, B:103:0x0154, B:106:0x015c, B:109:0x0161, B:111:0x016b, B:113:0x016f, B:116:0x017b, B:119:0x0186, B:121:0x018a, B:124:0x0192, B:127:0x0197, B:129:0x01a1, B:131:0x01a5, B:132:0x01ae, B:133:0x01b4, B:135:0x01b8, B:138:0x01c0, B:141:0x01c5, B:143:0x01cf, B:145:0x01d3, B:146:0x01dc, B:165:0x0225, B:168:0x0237, B:170:0x023d, B:172:0x0242, B:173:0x0245, B:175:0x024d, B:176:0x0250, B:189:0x027f, B:190:0x028b, B:192:0x0291, B:193:0x0296, B:199:0x02a8, B:201:0x02b3, B:207:0x02cb, B:178:0x0256, B:179:0x0259, B:181:0x0261, B:186:0x0275, B:187:0x0278, B:183:0x0269, B:185:0x026d, B:163:0x021e, B:39:0x0078), top: B:220:0x0051 }] */
    /* JADX WARN: Code duplicated, block: B:106:0x015c A[Catch: all -> 0x0055, TryCatch #0 {all -> 0x0055, blocks: (B:28:0x0051, B:31:0x0058, B:33:0x0064, B:42:0x007f, B:44:0x0090, B:45:0x009c, B:47:0x00a2, B:49:0x00b4, B:52:0x00bc, B:55:0x00c1, B:57:0x00cb, B:59:0x00cf, B:62:0x00de, B:65:0x00e8, B:67:0x00ec, B:70:0x00f4, B:73:0x00f9, B:75:0x0103, B:77:0x0107, B:80:0x0112, B:83:0x011c, B:85:0x0120, B:88:0x0128, B:91:0x012d, B:93:0x0137, B:95:0x013b, B:98:0x0146, B:101:0x0150, B:103:0x0154, B:106:0x015c, B:109:0x0161, B:111:0x016b, B:113:0x016f, B:116:0x017b, B:119:0x0186, B:121:0x018a, B:124:0x0192, B:127:0x0197, B:129:0x01a1, B:131:0x01a5, B:132:0x01ae, B:133:0x01b4, B:135:0x01b8, B:138:0x01c0, B:141:0x01c5, B:143:0x01cf, B:145:0x01d3, B:146:0x01dc, B:165:0x0225, B:168:0x0237, B:170:0x023d, B:172:0x0242, B:173:0x0245, B:175:0x024d, B:176:0x0250, B:189:0x027f, B:190:0x028b, B:192:0x0291, B:193:0x0296, B:199:0x02a8, B:201:0x02b3, B:207:0x02cb, B:178:0x0256, B:179:0x0259, B:181:0x0261, B:186:0x0275, B:187:0x0278, B:183:0x0269, B:185:0x026d, B:163:0x021e, B:39:0x0078), top: B:220:0x0051 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x017b A[Catch: all -> 0x0055, TryCatch #0 {all -> 0x0055, blocks: (B:28:0x0051, B:31:0x0058, B:33:0x0064, B:42:0x007f, B:44:0x0090, B:45:0x009c, B:47:0x00a2, B:49:0x00b4, B:52:0x00bc, B:55:0x00c1, B:57:0x00cb, B:59:0x00cf, B:62:0x00de, B:65:0x00e8, B:67:0x00ec, B:70:0x00f4, B:73:0x00f9, B:75:0x0103, B:77:0x0107, B:80:0x0112, B:83:0x011c, B:85:0x0120, B:88:0x0128, B:91:0x012d, B:93:0x0137, B:95:0x013b, B:98:0x0146, B:101:0x0150, B:103:0x0154, B:106:0x015c, B:109:0x0161, B:111:0x016b, B:113:0x016f, B:116:0x017b, B:119:0x0186, B:121:0x018a, B:124:0x0192, B:127:0x0197, B:129:0x01a1, B:131:0x01a5, B:132:0x01ae, B:133:0x01b4, B:135:0x01b8, B:138:0x01c0, B:141:0x01c5, B:143:0x01cf, B:145:0x01d3, B:146:0x01dc, B:165:0x0225, B:168:0x0237, B:170:0x023d, B:172:0x0242, B:173:0x0245, B:175:0x024d, B:176:0x0250, B:189:0x027f, B:190:0x028b, B:192:0x0291, B:193:0x0296, B:199:0x02a8, B:201:0x02b3, B:207:0x02cb, B:178:0x0256, B:179:0x0259, B:181:0x0261, B:186:0x0275, B:187:0x0278, B:183:0x0269, B:185:0x026d, B:163:0x021e, B:39:0x0078), top: B:220:0x0051 }] */
    /* JADX WARN: Code duplicated, block: B:11:0x0021 A[PHI: r2
      0x0021: PHI (r2v26 java.util.Map<java.lang.String, java.lang.Object>) = 
      (r2v2 java.util.Map<java.lang.String, java.lang.Object>)
      (r2v2 java.util.Map<java.lang.String, java.lang.Object>)
      (r2v2 java.util.Map<java.lang.String, java.lang.Object>)
      (r2v1 java.util.Map<java.lang.String, java.lang.Object>)
     binds: [B:16:0x002f, B:18:0x0033, B:219:0x0021, B:9:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:121:0x018a A[Catch: all -> 0x0055, TryCatch #0 {all -> 0x0055, blocks: (B:28:0x0051, B:31:0x0058, B:33:0x0064, B:42:0x007f, B:44:0x0090, B:45:0x009c, B:47:0x00a2, B:49:0x00b4, B:52:0x00bc, B:55:0x00c1, B:57:0x00cb, B:59:0x00cf, B:62:0x00de, B:65:0x00e8, B:67:0x00ec, B:70:0x00f4, B:73:0x00f9, B:75:0x0103, B:77:0x0107, B:80:0x0112, B:83:0x011c, B:85:0x0120, B:88:0x0128, B:91:0x012d, B:93:0x0137, B:95:0x013b, B:98:0x0146, B:101:0x0150, B:103:0x0154, B:106:0x015c, B:109:0x0161, B:111:0x016b, B:113:0x016f, B:116:0x017b, B:119:0x0186, B:121:0x018a, B:124:0x0192, B:127:0x0197, B:129:0x01a1, B:131:0x01a5, B:132:0x01ae, B:133:0x01b4, B:135:0x01b8, B:138:0x01c0, B:141:0x01c5, B:143:0x01cf, B:145:0x01d3, B:146:0x01dc, B:165:0x0225, B:168:0x0237, B:170:0x023d, B:172:0x0242, B:173:0x0245, B:175:0x024d, B:176:0x0250, B:189:0x027f, B:190:0x028b, B:192:0x0291, B:193:0x0296, B:199:0x02a8, B:201:0x02b3, B:207:0x02cb, B:178:0x0256, B:179:0x0259, B:181:0x0261, B:186:0x0275, B:187:0x0278, B:183:0x0269, B:185:0x026d, B:163:0x021e, B:39:0x0078), top: B:220:0x0051 }] */
    /* JADX WARN: Code duplicated, block: B:124:0x0192 A[Catch: all -> 0x0055, TryCatch #0 {all -> 0x0055, blocks: (B:28:0x0051, B:31:0x0058, B:33:0x0064, B:42:0x007f, B:44:0x0090, B:45:0x009c, B:47:0x00a2, B:49:0x00b4, B:52:0x00bc, B:55:0x00c1, B:57:0x00cb, B:59:0x00cf, B:62:0x00de, B:65:0x00e8, B:67:0x00ec, B:70:0x00f4, B:73:0x00f9, B:75:0x0103, B:77:0x0107, B:80:0x0112, B:83:0x011c, B:85:0x0120, B:88:0x0128, B:91:0x012d, B:93:0x0137, B:95:0x013b, B:98:0x0146, B:101:0x0150, B:103:0x0154, B:106:0x015c, B:109:0x0161, B:111:0x016b, B:113:0x016f, B:116:0x017b, B:119:0x0186, B:121:0x018a, B:124:0x0192, B:127:0x0197, B:129:0x01a1, B:131:0x01a5, B:132:0x01ae, B:133:0x01b4, B:135:0x01b8, B:138:0x01c0, B:141:0x01c5, B:143:0x01cf, B:145:0x01d3, B:146:0x01dc, B:165:0x0225, B:168:0x0237, B:170:0x023d, B:172:0x0242, B:173:0x0245, B:175:0x024d, B:176:0x0250, B:189:0x027f, B:190:0x028b, B:192:0x0291, B:193:0x0296, B:199:0x02a8, B:201:0x02b3, B:207:0x02cb, B:178:0x0256, B:179:0x0259, B:181:0x0261, B:186:0x0275, B:187:0x0278, B:183:0x0269, B:185:0x026d, B:163:0x021e, B:39:0x0078), top: B:220:0x0051 }] */
    /* JADX WARN: Code duplicated, block: B:132:0x01ae A[Catch: all -> 0x0055, TryCatch #0 {all -> 0x0055, blocks: (B:28:0x0051, B:31:0x0058, B:33:0x0064, B:42:0x007f, B:44:0x0090, B:45:0x009c, B:47:0x00a2, B:49:0x00b4, B:52:0x00bc, B:55:0x00c1, B:57:0x00cb, B:59:0x00cf, B:62:0x00de, B:65:0x00e8, B:67:0x00ec, B:70:0x00f4, B:73:0x00f9, B:75:0x0103, B:77:0x0107, B:80:0x0112, B:83:0x011c, B:85:0x0120, B:88:0x0128, B:91:0x012d, B:93:0x0137, B:95:0x013b, B:98:0x0146, B:101:0x0150, B:103:0x0154, B:106:0x015c, B:109:0x0161, B:111:0x016b, B:113:0x016f, B:116:0x017b, B:119:0x0186, B:121:0x018a, B:124:0x0192, B:127:0x0197, B:129:0x01a1, B:131:0x01a5, B:132:0x01ae, B:133:0x01b4, B:135:0x01b8, B:138:0x01c0, B:141:0x01c5, B:143:0x01cf, B:145:0x01d3, B:146:0x01dc, B:165:0x0225, B:168:0x0237, B:170:0x023d, B:172:0x0242, B:173:0x0245, B:175:0x024d, B:176:0x0250, B:189:0x027f, B:190:0x028b, B:192:0x0291, B:193:0x0296, B:199:0x02a8, B:201:0x02b3, B:207:0x02cb, B:178:0x0256, B:179:0x0259, B:181:0x0261, B:186:0x0275, B:187:0x0278, B:183:0x0269, B:185:0x026d, B:163:0x021e, B:39:0x0078), top: B:220:0x0051 }] */
    /* JADX WARN: Code duplicated, block: B:135:0x01b8 A[Catch: all -> 0x0055, TryCatch #0 {all -> 0x0055, blocks: (B:28:0x0051, B:31:0x0058, B:33:0x0064, B:42:0x007f, B:44:0x0090, B:45:0x009c, B:47:0x00a2, B:49:0x00b4, B:52:0x00bc, B:55:0x00c1, B:57:0x00cb, B:59:0x00cf, B:62:0x00de, B:65:0x00e8, B:67:0x00ec, B:70:0x00f4, B:73:0x00f9, B:75:0x0103, B:77:0x0107, B:80:0x0112, B:83:0x011c, B:85:0x0120, B:88:0x0128, B:91:0x012d, B:93:0x0137, B:95:0x013b, B:98:0x0146, B:101:0x0150, B:103:0x0154, B:106:0x015c, B:109:0x0161, B:111:0x016b, B:113:0x016f, B:116:0x017b, B:119:0x0186, B:121:0x018a, B:124:0x0192, B:127:0x0197, B:129:0x01a1, B:131:0x01a5, B:132:0x01ae, B:133:0x01b4, B:135:0x01b8, B:138:0x01c0, B:141:0x01c5, B:143:0x01cf, B:145:0x01d3, B:146:0x01dc, B:165:0x0225, B:168:0x0237, B:170:0x023d, B:172:0x0242, B:173:0x0245, B:175:0x024d, B:176:0x0250, B:189:0x027f, B:190:0x028b, B:192:0x0291, B:193:0x0296, B:199:0x02a8, B:201:0x02b3, B:207:0x02cb, B:178:0x0256, B:179:0x0259, B:181:0x0261, B:186:0x0275, B:187:0x0278, B:183:0x0269, B:185:0x026d, B:163:0x021e, B:39:0x0078), top: B:220:0x0051 }] */
    /* JADX WARN: Code duplicated, block: B:138:0x01c0 A[Catch: all -> 0x0055, TryCatch #0 {all -> 0x0055, blocks: (B:28:0x0051, B:31:0x0058, B:33:0x0064, B:42:0x007f, B:44:0x0090, B:45:0x009c, B:47:0x00a2, B:49:0x00b4, B:52:0x00bc, B:55:0x00c1, B:57:0x00cb, B:59:0x00cf, B:62:0x00de, B:65:0x00e8, B:67:0x00ec, B:70:0x00f4, B:73:0x00f9, B:75:0x0103, B:77:0x0107, B:80:0x0112, B:83:0x011c, B:85:0x0120, B:88:0x0128, B:91:0x012d, B:93:0x0137, B:95:0x013b, B:98:0x0146, B:101:0x0150, B:103:0x0154, B:106:0x015c, B:109:0x0161, B:111:0x016b, B:113:0x016f, B:116:0x017b, B:119:0x0186, B:121:0x018a, B:124:0x0192, B:127:0x0197, B:129:0x01a1, B:131:0x01a5, B:132:0x01ae, B:133:0x01b4, B:135:0x01b8, B:138:0x01c0, B:141:0x01c5, B:143:0x01cf, B:145:0x01d3, B:146:0x01dc, B:165:0x0225, B:168:0x0237, B:170:0x023d, B:172:0x0242, B:173:0x0245, B:175:0x024d, B:176:0x0250, B:189:0x027f, B:190:0x028b, B:192:0x0291, B:193:0x0296, B:199:0x02a8, B:201:0x02b3, B:207:0x02cb, B:178:0x0256, B:179:0x0259, B:181:0x0261, B:186:0x0275, B:187:0x0278, B:183:0x0269, B:185:0x026d, B:163:0x021e, B:39:0x0078), top: B:220:0x0051 }] */
    /* JADX WARN: Code duplicated, block: B:146:0x01dc A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #0 {all -> 0x0055, blocks: (B:28:0x0051, B:31:0x0058, B:33:0x0064, B:42:0x007f, B:44:0x0090, B:45:0x009c, B:47:0x00a2, B:49:0x00b4, B:52:0x00bc, B:55:0x00c1, B:57:0x00cb, B:59:0x00cf, B:62:0x00de, B:65:0x00e8, B:67:0x00ec, B:70:0x00f4, B:73:0x00f9, B:75:0x0103, B:77:0x0107, B:80:0x0112, B:83:0x011c, B:85:0x0120, B:88:0x0128, B:91:0x012d, B:93:0x0137, B:95:0x013b, B:98:0x0146, B:101:0x0150, B:103:0x0154, B:106:0x015c, B:109:0x0161, B:111:0x016b, B:113:0x016f, B:116:0x017b, B:119:0x0186, B:121:0x018a, B:124:0x0192, B:127:0x0197, B:129:0x01a1, B:131:0x01a5, B:132:0x01ae, B:133:0x01b4, B:135:0x01b8, B:138:0x01c0, B:141:0x01c5, B:143:0x01cf, B:145:0x01d3, B:146:0x01dc, B:165:0x0225, B:168:0x0237, B:170:0x023d, B:172:0x0242, B:173:0x0245, B:175:0x024d, B:176:0x0250, B:189:0x027f, B:190:0x028b, B:192:0x0291, B:193:0x0296, B:199:0x02a8, B:201:0x02b3, B:207:0x02cb, B:178:0x0256, B:179:0x0259, B:181:0x0261, B:186:0x0275, B:187:0x0278, B:183:0x0269, B:185:0x026d, B:163:0x021e, B:39:0x0078), top: B:220:0x0051 }] */
    /* JADX WARN: Code duplicated, block: B:150:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:151:0x01eb A[Catch: all -> 0x020d, TryCatch #1 {all -> 0x020d, blocks: (B:148:0x01e4, B:151:0x01eb, B:153:0x01ef, B:156:0x01f6, B:195:0x02a0, B:197:0x02a4, B:204:0x02b8, B:161:0x0212), top: B:222:0x01e4 }] */
    /* JADX WARN: Code duplicated, block: B:153:0x01ef A[Catch: all -> 0x020d, TryCatch #1 {all -> 0x020d, blocks: (B:148:0x01e4, B:151:0x01eb, B:153:0x01ef, B:156:0x01f6, B:195:0x02a0, B:197:0x02a4, B:204:0x02b8, B:161:0x0212), top: B:222:0x01e4 }] */
    /* JADX WARN: Code duplicated, block: B:155:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:165:0x0225 A[Catch: all -> 0x0055, TryCatch #0 {all -> 0x0055, blocks: (B:28:0x0051, B:31:0x0058, B:33:0x0064, B:42:0x007f, B:44:0x0090, B:45:0x009c, B:47:0x00a2, B:49:0x00b4, B:52:0x00bc, B:55:0x00c1, B:57:0x00cb, B:59:0x00cf, B:62:0x00de, B:65:0x00e8, B:67:0x00ec, B:70:0x00f4, B:73:0x00f9, B:75:0x0103, B:77:0x0107, B:80:0x0112, B:83:0x011c, B:85:0x0120, B:88:0x0128, B:91:0x012d, B:93:0x0137, B:95:0x013b, B:98:0x0146, B:101:0x0150, B:103:0x0154, B:106:0x015c, B:109:0x0161, B:111:0x016b, B:113:0x016f, B:116:0x017b, B:119:0x0186, B:121:0x018a, B:124:0x0192, B:127:0x0197, B:129:0x01a1, B:131:0x01a5, B:132:0x01ae, B:133:0x01b4, B:135:0x01b8, B:138:0x01c0, B:141:0x01c5, B:143:0x01cf, B:145:0x01d3, B:146:0x01dc, B:165:0x0225, B:168:0x0237, B:170:0x023d, B:172:0x0242, B:173:0x0245, B:175:0x024d, B:176:0x0250, B:189:0x027f, B:190:0x028b, B:192:0x0291, B:193:0x0296, B:199:0x02a8, B:201:0x02b3, B:207:0x02cb, B:178:0x0256, B:179:0x0259, B:181:0x0261, B:186:0x0275, B:187:0x0278, B:183:0x0269, B:185:0x026d, B:163:0x021e, B:39:0x0078), top: B:220:0x0051 }] */
    /* JADX WARN: Code duplicated, block: B:170:0x023d A[Catch: all -> 0x0055, TryCatch #0 {all -> 0x0055, blocks: (B:28:0x0051, B:31:0x0058, B:33:0x0064, B:42:0x007f, B:44:0x0090, B:45:0x009c, B:47:0x00a2, B:49:0x00b4, B:52:0x00bc, B:55:0x00c1, B:57:0x00cb, B:59:0x00cf, B:62:0x00de, B:65:0x00e8, B:67:0x00ec, B:70:0x00f4, B:73:0x00f9, B:75:0x0103, B:77:0x0107, B:80:0x0112, B:83:0x011c, B:85:0x0120, B:88:0x0128, B:91:0x012d, B:93:0x0137, B:95:0x013b, B:98:0x0146, B:101:0x0150, B:103:0x0154, B:106:0x015c, B:109:0x0161, B:111:0x016b, B:113:0x016f, B:116:0x017b, B:119:0x0186, B:121:0x018a, B:124:0x0192, B:127:0x0197, B:129:0x01a1, B:131:0x01a5, B:132:0x01ae, B:133:0x01b4, B:135:0x01b8, B:138:0x01c0, B:141:0x01c5, B:143:0x01cf, B:145:0x01d3, B:146:0x01dc, B:165:0x0225, B:168:0x0237, B:170:0x023d, B:172:0x0242, B:173:0x0245, B:175:0x024d, B:176:0x0250, B:189:0x027f, B:190:0x028b, B:192:0x0291, B:193:0x0296, B:199:0x02a8, B:201:0x02b3, B:207:0x02cb, B:178:0x0256, B:179:0x0259, B:181:0x0261, B:186:0x0275, B:187:0x0278, B:183:0x0269, B:185:0x026d, B:163:0x021e, B:39:0x0078), top: B:220:0x0051 }] */
    /* JADX WARN: Code duplicated, block: B:172:0x0242 A[Catch: all -> 0x0055, TryCatch #0 {all -> 0x0055, blocks: (B:28:0x0051, B:31:0x0058, B:33:0x0064, B:42:0x007f, B:44:0x0090, B:45:0x009c, B:47:0x00a2, B:49:0x00b4, B:52:0x00bc, B:55:0x00c1, B:57:0x00cb, B:59:0x00cf, B:62:0x00de, B:65:0x00e8, B:67:0x00ec, B:70:0x00f4, B:73:0x00f9, B:75:0x0103, B:77:0x0107, B:80:0x0112, B:83:0x011c, B:85:0x0120, B:88:0x0128, B:91:0x012d, B:93:0x0137, B:95:0x013b, B:98:0x0146, B:101:0x0150, B:103:0x0154, B:106:0x015c, B:109:0x0161, B:111:0x016b, B:113:0x016f, B:116:0x017b, B:119:0x0186, B:121:0x018a, B:124:0x0192, B:127:0x0197, B:129:0x01a1, B:131:0x01a5, B:132:0x01ae, B:133:0x01b4, B:135:0x01b8, B:138:0x01c0, B:141:0x01c5, B:143:0x01cf, B:145:0x01d3, B:146:0x01dc, B:165:0x0225, B:168:0x0237, B:170:0x023d, B:172:0x0242, B:173:0x0245, B:175:0x024d, B:176:0x0250, B:189:0x027f, B:190:0x028b, B:192:0x0291, B:193:0x0296, B:199:0x02a8, B:201:0x02b3, B:207:0x02cb, B:178:0x0256, B:179:0x0259, B:181:0x0261, B:186:0x0275, B:187:0x0278, B:183:0x0269, B:185:0x026d, B:163:0x021e, B:39:0x0078), top: B:220:0x0051 }] */
    /* JADX WARN: Code duplicated, block: B:175:0x024d A[Catch: all -> 0x0055, TryCatch #0 {all -> 0x0055, blocks: (B:28:0x0051, B:31:0x0058, B:33:0x0064, B:42:0x007f, B:44:0x0090, B:45:0x009c, B:47:0x00a2, B:49:0x00b4, B:52:0x00bc, B:55:0x00c1, B:57:0x00cb, B:59:0x00cf, B:62:0x00de, B:65:0x00e8, B:67:0x00ec, B:70:0x00f4, B:73:0x00f9, B:75:0x0103, B:77:0x0107, B:80:0x0112, B:83:0x011c, B:85:0x0120, B:88:0x0128, B:91:0x012d, B:93:0x0137, B:95:0x013b, B:98:0x0146, B:101:0x0150, B:103:0x0154, B:106:0x015c, B:109:0x0161, B:111:0x016b, B:113:0x016f, B:116:0x017b, B:119:0x0186, B:121:0x018a, B:124:0x0192, B:127:0x0197, B:129:0x01a1, B:131:0x01a5, B:132:0x01ae, B:133:0x01b4, B:135:0x01b8, B:138:0x01c0, B:141:0x01c5, B:143:0x01cf, B:145:0x01d3, B:146:0x01dc, B:165:0x0225, B:168:0x0237, B:170:0x023d, B:172:0x0242, B:173:0x0245, B:175:0x024d, B:176:0x0250, B:189:0x027f, B:190:0x028b, B:192:0x0291, B:193:0x0296, B:199:0x02a8, B:201:0x02b3, B:207:0x02cb, B:178:0x0256, B:179:0x0259, B:181:0x0261, B:186:0x0275, B:187:0x0278, B:183:0x0269, B:185:0x026d, B:163:0x021e, B:39:0x0078), top: B:220:0x0051 }] */
    /* JADX WARN: Code duplicated, block: B:177:0x0254 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:178:0x0256 A[Catch: all -> 0x0055, TryCatch #0 {all -> 0x0055, blocks: (B:28:0x0051, B:31:0x0058, B:33:0x0064, B:42:0x007f, B:44:0x0090, B:45:0x009c, B:47:0x00a2, B:49:0x00b4, B:52:0x00bc, B:55:0x00c1, B:57:0x00cb, B:59:0x00cf, B:62:0x00de, B:65:0x00e8, B:67:0x00ec, B:70:0x00f4, B:73:0x00f9, B:75:0x0103, B:77:0x0107, B:80:0x0112, B:83:0x011c, B:85:0x0120, B:88:0x0128, B:91:0x012d, B:93:0x0137, B:95:0x013b, B:98:0x0146, B:101:0x0150, B:103:0x0154, B:106:0x015c, B:109:0x0161, B:111:0x016b, B:113:0x016f, B:116:0x017b, B:119:0x0186, B:121:0x018a, B:124:0x0192, B:127:0x0197, B:129:0x01a1, B:131:0x01a5, B:132:0x01ae, B:133:0x01b4, B:135:0x01b8, B:138:0x01c0, B:141:0x01c5, B:143:0x01cf, B:145:0x01d3, B:146:0x01dc, B:165:0x0225, B:168:0x0237, B:170:0x023d, B:172:0x0242, B:173:0x0245, B:175:0x024d, B:176:0x0250, B:189:0x027f, B:190:0x028b, B:192:0x0291, B:193:0x0296, B:199:0x02a8, B:201:0x02b3, B:207:0x02cb, B:178:0x0256, B:179:0x0259, B:181:0x0261, B:186:0x0275, B:187:0x0278, B:183:0x0269, B:185:0x026d, B:163:0x021e, B:39:0x0078), top: B:220:0x0051 }] */
    /* JADX WARN: Code duplicated, block: B:181:0x0261 A[Catch: all -> 0x0055, TryCatch #0 {all -> 0x0055, blocks: (B:28:0x0051, B:31:0x0058, B:33:0x0064, B:42:0x007f, B:44:0x0090, B:45:0x009c, B:47:0x00a2, B:49:0x00b4, B:52:0x00bc, B:55:0x00c1, B:57:0x00cb, B:59:0x00cf, B:62:0x00de, B:65:0x00e8, B:67:0x00ec, B:70:0x00f4, B:73:0x00f9, B:75:0x0103, B:77:0x0107, B:80:0x0112, B:83:0x011c, B:85:0x0120, B:88:0x0128, B:91:0x012d, B:93:0x0137, B:95:0x013b, B:98:0x0146, B:101:0x0150, B:103:0x0154, B:106:0x015c, B:109:0x0161, B:111:0x016b, B:113:0x016f, B:116:0x017b, B:119:0x0186, B:121:0x018a, B:124:0x0192, B:127:0x0197, B:129:0x01a1, B:131:0x01a5, B:132:0x01ae, B:133:0x01b4, B:135:0x01b8, B:138:0x01c0, B:141:0x01c5, B:143:0x01cf, B:145:0x01d3, B:146:0x01dc, B:165:0x0225, B:168:0x0237, B:170:0x023d, B:172:0x0242, B:173:0x0245, B:175:0x024d, B:176:0x0250, B:189:0x027f, B:190:0x028b, B:192:0x0291, B:193:0x0296, B:199:0x02a8, B:201:0x02b3, B:207:0x02cb, B:178:0x0256, B:179:0x0259, B:181:0x0261, B:186:0x0275, B:187:0x0278, B:183:0x0269, B:185:0x026d, B:163:0x021e, B:39:0x0078), top: B:220:0x0051 }] */
    /* JADX WARN: Code duplicated, block: B:183:0x0269 A[Catch: all -> 0x0055, TryCatch #0 {all -> 0x0055, blocks: (B:28:0x0051, B:31:0x0058, B:33:0x0064, B:42:0x007f, B:44:0x0090, B:45:0x009c, B:47:0x00a2, B:49:0x00b4, B:52:0x00bc, B:55:0x00c1, B:57:0x00cb, B:59:0x00cf, B:62:0x00de, B:65:0x00e8, B:67:0x00ec, B:70:0x00f4, B:73:0x00f9, B:75:0x0103, B:77:0x0107, B:80:0x0112, B:83:0x011c, B:85:0x0120, B:88:0x0128, B:91:0x012d, B:93:0x0137, B:95:0x013b, B:98:0x0146, B:101:0x0150, B:103:0x0154, B:106:0x015c, B:109:0x0161, B:111:0x016b, B:113:0x016f, B:116:0x017b, B:119:0x0186, B:121:0x018a, B:124:0x0192, B:127:0x0197, B:129:0x01a1, B:131:0x01a5, B:132:0x01ae, B:133:0x01b4, B:135:0x01b8, B:138:0x01c0, B:141:0x01c5, B:143:0x01cf, B:145:0x01d3, B:146:0x01dc, B:165:0x0225, B:168:0x0237, B:170:0x023d, B:172:0x0242, B:173:0x0245, B:175:0x024d, B:176:0x0250, B:189:0x027f, B:190:0x028b, B:192:0x0291, B:193:0x0296, B:199:0x02a8, B:201:0x02b3, B:207:0x02cb, B:178:0x0256, B:179:0x0259, B:181:0x0261, B:186:0x0275, B:187:0x0278, B:183:0x0269, B:185:0x026d, B:163:0x021e, B:39:0x0078), top: B:220:0x0051 }] */
    /* JADX WARN: Code duplicated, block: B:192:0x0291 A[Catch: all -> 0x0055, TryCatch #0 {all -> 0x0055, blocks: (B:28:0x0051, B:31:0x0058, B:33:0x0064, B:42:0x007f, B:44:0x0090, B:45:0x009c, B:47:0x00a2, B:49:0x00b4, B:52:0x00bc, B:55:0x00c1, B:57:0x00cb, B:59:0x00cf, B:62:0x00de, B:65:0x00e8, B:67:0x00ec, B:70:0x00f4, B:73:0x00f9, B:75:0x0103, B:77:0x0107, B:80:0x0112, B:83:0x011c, B:85:0x0120, B:88:0x0128, B:91:0x012d, B:93:0x0137, B:95:0x013b, B:98:0x0146, B:101:0x0150, B:103:0x0154, B:106:0x015c, B:109:0x0161, B:111:0x016b, B:113:0x016f, B:116:0x017b, B:119:0x0186, B:121:0x018a, B:124:0x0192, B:127:0x0197, B:129:0x01a1, B:131:0x01a5, B:132:0x01ae, B:133:0x01b4, B:135:0x01b8, B:138:0x01c0, B:141:0x01c5, B:143:0x01cf, B:145:0x01d3, B:146:0x01dc, B:165:0x0225, B:168:0x0237, B:170:0x023d, B:172:0x0242, B:173:0x0245, B:175:0x024d, B:176:0x0250, B:189:0x027f, B:190:0x028b, B:192:0x0291, B:193:0x0296, B:199:0x02a8, B:201:0x02b3, B:207:0x02cb, B:178:0x0256, B:179:0x0259, B:181:0x0261, B:186:0x0275, B:187:0x0278, B:183:0x0269, B:185:0x026d, B:163:0x021e, B:39:0x0078), top: B:220:0x0051 }] */
    /* JADX WARN: Code duplicated, block: B:195:0x02a0 A[Catch: all -> 0x020d, TRY_ENTER, TryCatch #1 {all -> 0x020d, blocks: (B:148:0x01e4, B:151:0x01eb, B:153:0x01ef, B:156:0x01f6, B:195:0x02a0, B:197:0x02a4, B:204:0x02b8, B:161:0x0212), top: B:222:0x01e4 }] */
    /* JADX WARN: Code duplicated, block: B:203:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:206:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:222:0x01e4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:227:0x0237 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:236:0x0184 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:238:0x028b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:239:0x027f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00e8 A[Catch: all -> 0x0055, TryCatch #0 {all -> 0x0055, blocks: (B:28:0x0051, B:31:0x0058, B:33:0x0064, B:42:0x007f, B:44:0x0090, B:45:0x009c, B:47:0x00a2, B:49:0x00b4, B:52:0x00bc, B:55:0x00c1, B:57:0x00cb, B:59:0x00cf, B:62:0x00de, B:65:0x00e8, B:67:0x00ec, B:70:0x00f4, B:73:0x00f9, B:75:0x0103, B:77:0x0107, B:80:0x0112, B:83:0x011c, B:85:0x0120, B:88:0x0128, B:91:0x012d, B:93:0x0137, B:95:0x013b, B:98:0x0146, B:101:0x0150, B:103:0x0154, B:106:0x015c, B:109:0x0161, B:111:0x016b, B:113:0x016f, B:116:0x017b, B:119:0x0186, B:121:0x018a, B:124:0x0192, B:127:0x0197, B:129:0x01a1, B:131:0x01a5, B:132:0x01ae, B:133:0x01b4, B:135:0x01b8, B:138:0x01c0, B:141:0x01c5, B:143:0x01cf, B:145:0x01d3, B:146:0x01dc, B:165:0x0225, B:168:0x0237, B:170:0x023d, B:172:0x0242, B:173:0x0245, B:175:0x024d, B:176:0x0250, B:189:0x027f, B:190:0x028b, B:192:0x0291, B:193:0x0296, B:199:0x02a8, B:201:0x02b3, B:207:0x02cb, B:178:0x0256, B:179:0x0259, B:181:0x0261, B:186:0x0275, B:187:0x0278, B:183:0x0269, B:185:0x026d, B:163:0x021e, B:39:0x0078), top: B:220:0x0051 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x00ec A[Catch: all -> 0x0055, TryCatch #0 {all -> 0x0055, blocks: (B:28:0x0051, B:31:0x0058, B:33:0x0064, B:42:0x007f, B:44:0x0090, B:45:0x009c, B:47:0x00a2, B:49:0x00b4, B:52:0x00bc, B:55:0x00c1, B:57:0x00cb, B:59:0x00cf, B:62:0x00de, B:65:0x00e8, B:67:0x00ec, B:70:0x00f4, B:73:0x00f9, B:75:0x0103, B:77:0x0107, B:80:0x0112, B:83:0x011c, B:85:0x0120, B:88:0x0128, B:91:0x012d, B:93:0x0137, B:95:0x013b, B:98:0x0146, B:101:0x0150, B:103:0x0154, B:106:0x015c, B:109:0x0161, B:111:0x016b, B:113:0x016f, B:116:0x017b, B:119:0x0186, B:121:0x018a, B:124:0x0192, B:127:0x0197, B:129:0x01a1, B:131:0x01a5, B:132:0x01ae, B:133:0x01b4, B:135:0x01b8, B:138:0x01c0, B:141:0x01c5, B:143:0x01cf, B:145:0x01d3, B:146:0x01dc, B:165:0x0225, B:168:0x0237, B:170:0x023d, B:172:0x0242, B:173:0x0245, B:175:0x024d, B:176:0x0250, B:189:0x027f, B:190:0x028b, B:192:0x0291, B:193:0x0296, B:199:0x02a8, B:201:0x02b3, B:207:0x02cb, B:178:0x0256, B:179:0x0259, B:181:0x0261, B:186:0x0275, B:187:0x0278, B:183:0x0269, B:185:0x026d, B:163:0x021e, B:39:0x0078), top: B:220:0x0051 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x011c A[Catch: all -> 0x0055, TryCatch #0 {all -> 0x0055, blocks: (B:28:0x0051, B:31:0x0058, B:33:0x0064, B:42:0x007f, B:44:0x0090, B:45:0x009c, B:47:0x00a2, B:49:0x00b4, B:52:0x00bc, B:55:0x00c1, B:57:0x00cb, B:59:0x00cf, B:62:0x00de, B:65:0x00e8, B:67:0x00ec, B:70:0x00f4, B:73:0x00f9, B:75:0x0103, B:77:0x0107, B:80:0x0112, B:83:0x011c, B:85:0x0120, B:88:0x0128, B:91:0x012d, B:93:0x0137, B:95:0x013b, B:98:0x0146, B:101:0x0150, B:103:0x0154, B:106:0x015c, B:109:0x0161, B:111:0x016b, B:113:0x016f, B:116:0x017b, B:119:0x0186, B:121:0x018a, B:124:0x0192, B:127:0x0197, B:129:0x01a1, B:131:0x01a5, B:132:0x01ae, B:133:0x01b4, B:135:0x01b8, B:138:0x01c0, B:141:0x01c5, B:143:0x01cf, B:145:0x01d3, B:146:0x01dc, B:165:0x0225, B:168:0x0237, B:170:0x023d, B:172:0x0242, B:173:0x0245, B:175:0x024d, B:176:0x0250, B:189:0x027f, B:190:0x028b, B:192:0x0291, B:193:0x0296, B:199:0x02a8, B:201:0x02b3, B:207:0x02cb, B:178:0x0256, B:179:0x0259, B:181:0x0261, B:186:0x0275, B:187:0x0278, B:183:0x0269, B:185:0x026d, B:163:0x021e, B:39:0x0078), top: B:220:0x0051 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0120 A[Catch: all -> 0x0055, TryCatch #0 {all -> 0x0055, blocks: (B:28:0x0051, B:31:0x0058, B:33:0x0064, B:42:0x007f, B:44:0x0090, B:45:0x009c, B:47:0x00a2, B:49:0x00b4, B:52:0x00bc, B:55:0x00c1, B:57:0x00cb, B:59:0x00cf, B:62:0x00de, B:65:0x00e8, B:67:0x00ec, B:70:0x00f4, B:73:0x00f9, B:75:0x0103, B:77:0x0107, B:80:0x0112, B:83:0x011c, B:85:0x0120, B:88:0x0128, B:91:0x012d, B:93:0x0137, B:95:0x013b, B:98:0x0146, B:101:0x0150, B:103:0x0154, B:106:0x015c, B:109:0x0161, B:111:0x016b, B:113:0x016f, B:116:0x017b, B:119:0x0186, B:121:0x018a, B:124:0x0192, B:127:0x0197, B:129:0x01a1, B:131:0x01a5, B:132:0x01ae, B:133:0x01b4, B:135:0x01b8, B:138:0x01c0, B:141:0x01c5, B:143:0x01cf, B:145:0x01d3, B:146:0x01dc, B:165:0x0225, B:168:0x0237, B:170:0x023d, B:172:0x0242, B:173:0x0245, B:175:0x024d, B:176:0x0250, B:189:0x027f, B:190:0x028b, B:192:0x0291, B:193:0x0296, B:199:0x02a8, B:201:0x02b3, B:207:0x02cb, B:178:0x0256, B:179:0x0259, B:181:0x0261, B:186:0x0275, B:187:0x0278, B:183:0x0269, B:185:0x026d, B:163:0x021e, B:39:0x0078), top: B:220:0x0051 }] */
    public void write(JSONSerializer jSONSerializer, Object obj, Object obj2, Type type, int i, boolean z) throws Throwable {
        Map<String, Object> treeMap;
        boolean z2;
        List<PropertyPreFilter> list;
        List<PropertyFilter> list2;
        List<PropertyFilter> list3;
        List<NameFilter> list4;
        List<NameFilter> list5;
        Class<?> cls;
        String str;
        int i2;
        Object obj3;
        Class<?> cls2;
        ObjectSerializer objectSerializer;
        ObjectSerializer objectSerializer2;
        Type type2;
        this = this;
        JSONSerializer jSONSerializer2 = jSONSerializer;
        obj = obj;
        SerializeWriter serializeWriter = jSONSerializer2.out;
        if (obj == null) {
            serializeWriter.writeNull();
            return;
        }
        Map<String, Object> innerMap = (Map) obj;
        int i3 = SerializerFeature.MapSortField.mask;
        if ((serializeWriter.features & i3) == 0 && (i & i3) == 0) {
            treeMap = innerMap;
        } else {
            if (innerMap instanceof JSONObject) {
                innerMap = ((JSONObject) innerMap).getInnerMap();
            }
            if ((innerMap instanceof SortedMap) || (innerMap instanceof LinkedHashMap)) {
                treeMap = innerMap;
            } else {
                try {
                    treeMap = new TreeMap(innerMap);
                } catch (Exception unused) {
                    treeMap = innerMap;
                }
            }
        }
        if (jSONSerializer.containsReference(obj)) {
            jSONSerializer.writeReference(obj);
            return;
        }
        SerialContext serialContext = jSONSerializer2.context;
        jSONSerializer2.setContext(serialContext, obj, obj2, 0);
        if (!z) {
            try {
                serializeWriter.write(123);
            } catch (Throwable th) {
                th = th;
                jSONSerializer2.context = serialContext;
                throw th;
            }
        }
        jSONSerializer2.incrementIndent();
        if (serializeWriter.isEnabled(SerializerFeature.WriteClassName)) {
            String str2 = jSONSerializer2.config.typeKey;
            Class<?> cls3 = treeMap.getClass();
            if ((cls3 == JSONObject.class || cls3 == HashMap.class || cls3 == LinkedHashMap.class) && treeMap.containsKey(str2)) {
                z2 = true;
            } else {
                serializeWriter.writeFieldName(str2);
                serializeWriter.writeString(obj.getClass().getName());
                z2 = false;
            }
        } else {
            z2 = true;
        }
        boolean z3 = z2;
        Class<?> cls4 = null;
        ObjectSerializer objectWriter = null;
        for (Map.Entry<String, Object> entry : treeMap.entrySet()) {
            Object value = entry.getValue();
            String key = entry.getKey();
            List<PropertyPreFilter> list6 = jSONSerializer2.propertyPreFilters;
            if (list6 == null || list6.size() <= 0) {
                list = this.propertyPreFilters;
                if (list != null || list.size() <= 0) {
                    list2 = jSONSerializer2.propertyFilters;
                    if (list2 != null || list2.size() <= 0) {
                        list3 = this.propertyFilters;
                        if (list3 != null && list3.size() > 0) {
                            if (key != null || (key instanceof String)) {
                                if (!this.apply(jSONSerializer2, obj, key, value)) {
                                    cls = cls4;
                                    cls4 = cls;
                                }
                            } else if ((key.getClass().isPrimitive() || (key instanceof Number)) && !this.apply(jSONSerializer2, obj, JSON.toJSONString(key), value)) {
                                cls = cls4;
                                cls4 = cls;
                            }
                        }
                        list4 = jSONSerializer2.nameFilters;
                        if (list4 != null && list4.size() > 0) {
                            if (key != null || (key instanceof String)) {
                                key = this.processKey(jSONSerializer2, obj, key, value);
                            } else if (key.getClass().isPrimitive() || (key instanceof Number)) {
                                key = this.processKey(jSONSerializer2, obj, JSON.toJSONString(key), value);
                            }
                        }
                        list5 = this.nameFilters;
                        if (list5 != null && list5.size() > 0) {
                            if (key != null || (key instanceof String)) {
                                key = this.processKey(jSONSerializer2, obj, key, value);
                            } else if (key.getClass().isPrimitive() || (key instanceof Number)) {
                                key = this.processKey(jSONSerializer2, obj, JSON.toJSONString(key), value);
                            }
                        }
                        if (key != null) {
                            try {
                                if (key instanceof String) {
                                    cls = cls4;
                                    str = key;
                                    jSONSerializer2 = jSONSerializer;
                                    i2 = i;
                                    value = processValue(jSONSerializer2, null, obj, str, value, i2);
                                } else {
                                    if (!(key instanceof Map) || (key instanceof Collection)) {
                                        cls = cls4;
                                        str = key;
                                    } else {
                                        String str3 = key;
                                        str = str3;
                                        cls = cls4;
                                        value = this.processValue(jSONSerializer2, null, obj, JSON.toJSONString(str3), value, i);
                                    }
                                    jSONSerializer2 = jSONSerializer;
                                    i2 = i;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                jSONSerializer2 = jSONSerializer;
                                jSONSerializer2.context = serialContext;
                                throw th;
                            }
                        } else {
                            cls = cls4;
                            str = key;
                            jSONSerializer2 = jSONSerializer;
                            i2 = i;
                            value = processValue(jSONSerializer2, null, obj, str, value, i2);
                        }
                        obj3 = value;
                        if (obj3 == null || SerializerFeature.isEnabled(serializeWriter.features, i2, SerializerFeature.WriteMapNullValue)) {
                            if (str instanceof String) {
                                String str4 = str;
                                if (!z3) {
                                    serializeWriter.write(44);
                                }
                                if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                    jSONSerializer2.println();
                                }
                                serializeWriter.writeFieldName(str4, true);
                            } else {
                                if (!z3) {
                                    serializeWriter.write(44);
                                }
                                if ((!serializeWriter.isEnabled(NON_STRINGKEY_AS_STRING) || SerializerFeature.isEnabled(i2, SerializerFeature.WriteNonStringKeyAsString)) && !(str instanceof Enum)) {
                                    jSONSerializer2.write(JSON.toJSONString(str));
                                } else {
                                    jSONSerializer2.write((Object) str);
                                }
                                serializeWriter.write(58);
                            }
                            if (obj3 == null) {
                                serializeWriter.writeNull();
                                cls4 = cls;
                                z3 = false;
                            } else {
                                cls2 = obj3.getClass();
                                if (cls2 != cls) {
                                    objectWriter = jSONSerializer2.getObjectWriter(cls2);
                                    cls = cls2;
                                }
                                objectSerializer = objectWriter;
                                if (SerializerFeature.isEnabled(i2, SerializerFeature.WriteClassName) || !(objectSerializer instanceof JavaBeanSerializer)) {
                                    jSONSerializer2 = jSONSerializer;
                                    objectSerializer2 = objectSerializer;
                                    objectSerializer2.write(jSONSerializer2, obj3, str, null, i);
                                } else {
                                    if (type instanceof ParameterizedType) {
                                        Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
                                        if (actualTypeArguments.length == 2) {
                                            type2 = actualTypeArguments[1];
                                        } else {
                                            type2 = null;
                                        }
                                    } else {
                                        type2 = null;
                                    }
                                    ((JavaBeanSerializer) objectSerializer).writeNoneASM(jSONSerializer2, obj3, str, type2, i2);
                                    jSONSerializer2 = jSONSerializer;
                                    objectSerializer2 = objectSerializer;
                                }
                                objectWriter = objectSerializer2;
                                cls4 = cls;
                                z3 = false;
                            }
                        } else {
                            cls4 = cls;
                        }
                    } else {
                        if (key == null || (key instanceof String)) {
                            if (this.apply(jSONSerializer2, obj, key, value)) {
                                list3 = this.propertyFilters;
                                if (list3 != null) {
                                    if (key != null) {
                                        if (!this.apply(jSONSerializer2, obj, key, value)) {
                                        }
                                    } else if (!this.apply(jSONSerializer2, obj, key, value)) {
                                    }
                                }
                                list4 = jSONSerializer2.nameFilters;
                                if (list4 != null) {
                                    if (key != null) {
                                        key = this.processKey(jSONSerializer2, obj, key, value);
                                    } else {
                                        key = this.processKey(jSONSerializer2, obj, key, value);
                                    }
                                }
                                list5 = this.nameFilters;
                                if (list5 != null) {
                                    if (key != null) {
                                        key = this.processKey(jSONSerializer2, obj, key, value);
                                    } else {
                                        key = this.processKey(jSONSerializer2, obj, key, value);
                                    }
                                }
                                if (key != null) {
                                    cls = cls4;
                                    str = key;
                                    jSONSerializer2 = jSONSerializer;
                                    i2 = i;
                                    value = processValue(jSONSerializer2, null, obj, str, value, i2);
                                } else if (key instanceof String) {
                                    cls = cls4;
                                    str = key;
                                    jSONSerializer2 = jSONSerializer;
                                    i2 = i;
                                    value = processValue(jSONSerializer2, null, obj, str, value, i2);
                                } else {
                                    if (key instanceof Map) {
                                        cls = cls4;
                                        str = key;
                                    } else {
                                        cls = cls4;
                                        str = key;
                                    }
                                    jSONSerializer2 = jSONSerializer;
                                    i2 = i;
                                }
                                obj3 = value;
                                if (obj3 == null) {
                                }
                                if (str instanceof String) {
                                    String str5 = str;
                                    if (!z3) {
                                        serializeWriter.write(44);
                                    }
                                    if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                        jSONSerializer2.println();
                                    }
                                    serializeWriter.writeFieldName(str5, true);
                                } else {
                                    if (!z3) {
                                        serializeWriter.write(44);
                                    }
                                    if (serializeWriter.isEnabled(NON_STRINGKEY_AS_STRING)) {
                                        jSONSerializer2.write(JSON.toJSONString(str));
                                    } else {
                                        jSONSerializer2.write(JSON.toJSONString(str));
                                    }
                                    serializeWriter.write(58);
                                }
                                if (obj3 == null) {
                                    serializeWriter.writeNull();
                                    cls4 = cls;
                                    z3 = false;
                                } else {
                                    cls2 = obj3.getClass();
                                    if (cls2 != cls) {
                                        objectWriter = jSONSerializer2.getObjectWriter(cls2);
                                        cls = cls2;
                                    }
                                    objectSerializer = objectWriter;
                                    if (SerializerFeature.isEnabled(i2, SerializerFeature.WriteClassName)) {
                                        jSONSerializer2 = jSONSerializer;
                                        objectSerializer2 = objectSerializer;
                                        objectSerializer2.write(jSONSerializer2, obj3, str, null, i);
                                    } else {
                                        jSONSerializer2 = jSONSerializer;
                                        objectSerializer2 = objectSerializer;
                                        objectSerializer2.write(jSONSerializer2, obj3, str, null, i);
                                    }
                                    objectWriter = objectSerializer2;
                                    cls4 = cls;
                                    z3 = false;
                                }
                            }
                        } else if ((!key.getClass().isPrimitive() && !(key instanceof Number)) || this.apply(jSONSerializer2, obj, JSON.toJSONString(key), value)) {
                            list3 = this.propertyFilters;
                            if (list3 != null) {
                                if (key != null) {
                                    if (!this.apply(jSONSerializer2, obj, key, value)) {
                                    }
                                } else if (!this.apply(jSONSerializer2, obj, key, value)) {
                                }
                            }
                            list4 = jSONSerializer2.nameFilters;
                            if (list4 != null) {
                                if (key != null) {
                                    key = this.processKey(jSONSerializer2, obj, key, value);
                                } else {
                                    key = this.processKey(jSONSerializer2, obj, key, value);
                                }
                            }
                            list5 = this.nameFilters;
                            if (list5 != null) {
                                if (key != null) {
                                    key = this.processKey(jSONSerializer2, obj, key, value);
                                } else {
                                    key = this.processKey(jSONSerializer2, obj, key, value);
                                }
                            }
                            if (key != null) {
                                cls = cls4;
                                str = key;
                                jSONSerializer2 = jSONSerializer;
                                i2 = i;
                                value = processValue(jSONSerializer2, null, obj, str, value, i2);
                            } else if (key instanceof String) {
                                cls = cls4;
                                str = key;
                                jSONSerializer2 = jSONSerializer;
                                i2 = i;
                                value = processValue(jSONSerializer2, null, obj, str, value, i2);
                            } else {
                                if (key instanceof Map) {
                                    cls = cls4;
                                    str = key;
                                } else {
                                    cls = cls4;
                                    str = key;
                                }
                                jSONSerializer2 = jSONSerializer;
                                i2 = i;
                            }
                            obj3 = value;
                            if (obj3 == null) {
                            }
                            if (str instanceof String) {
                                String str6 = str;
                                if (!z3) {
                                    serializeWriter.write(44);
                                }
                                if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                    jSONSerializer2.println();
                                }
                                serializeWriter.writeFieldName(str6, true);
                            } else {
                                if (!z3) {
                                    serializeWriter.write(44);
                                }
                                if (serializeWriter.isEnabled(NON_STRINGKEY_AS_STRING)) {
                                    jSONSerializer2.write(JSON.toJSONString(str));
                                } else {
                                    jSONSerializer2.write(JSON.toJSONString(str));
                                }
                                serializeWriter.write(58);
                            }
                            if (obj3 == null) {
                                serializeWriter.writeNull();
                                cls4 = cls;
                                z3 = false;
                            } else {
                                cls2 = obj3.getClass();
                                if (cls2 != cls) {
                                    objectWriter = jSONSerializer2.getObjectWriter(cls2);
                                    cls = cls2;
                                }
                                objectSerializer = objectWriter;
                                if (SerializerFeature.isEnabled(i2, SerializerFeature.WriteClassName)) {
                                    jSONSerializer2 = jSONSerializer;
                                    objectSerializer2 = objectSerializer;
                                    objectSerializer2.write(jSONSerializer2, obj3, str, null, i);
                                } else {
                                    jSONSerializer2 = jSONSerializer;
                                    objectSerializer2 = objectSerializer;
                                    objectSerializer2.write(jSONSerializer2, obj3, str, null, i);
                                }
                                objectWriter = objectSerializer2;
                                cls4 = cls;
                                z3 = false;
                            }
                        }
                        cls = cls4;
                        cls4 = cls;
                    }
                } else {
                    if (key == null || (key instanceof String)) {
                        if (this.applyName(jSONSerializer2, obj, key)) {
                            list2 = jSONSerializer2.propertyFilters;
                            if (list2 != null) {
                                list3 = this.propertyFilters;
                                if (list3 != null) {
                                    if (key != null) {
                                        if (!this.apply(jSONSerializer2, obj, key, value)) {
                                        }
                                    } else if (!this.apply(jSONSerializer2, obj, key, value)) {
                                    }
                                }
                                list4 = jSONSerializer2.nameFilters;
                                if (list4 != null) {
                                    if (key != null) {
                                        key = this.processKey(jSONSerializer2, obj, key, value);
                                    } else {
                                        key = this.processKey(jSONSerializer2, obj, key, value);
                                    }
                                }
                                list5 = this.nameFilters;
                                if (list5 != null) {
                                    if (key != null) {
                                        key = this.processKey(jSONSerializer2, obj, key, value);
                                    } else {
                                        key = this.processKey(jSONSerializer2, obj, key, value);
                                    }
                                }
                                if (key != null) {
                                    cls = cls4;
                                    str = key;
                                    jSONSerializer2 = jSONSerializer;
                                    i2 = i;
                                    value = processValue(jSONSerializer2, null, obj, str, value, i2);
                                } else if (key instanceof String) {
                                    cls = cls4;
                                    str = key;
                                    jSONSerializer2 = jSONSerializer;
                                    i2 = i;
                                    value = processValue(jSONSerializer2, null, obj, str, value, i2);
                                } else {
                                    if (key instanceof Map) {
                                        cls = cls4;
                                        str = key;
                                    } else {
                                        cls = cls4;
                                        str = key;
                                    }
                                    jSONSerializer2 = jSONSerializer;
                                    i2 = i;
                                }
                                obj3 = value;
                                if (obj3 == null) {
                                }
                                if (str instanceof String) {
                                    String str7 = str;
                                    if (!z3) {
                                        serializeWriter.write(44);
                                    }
                                    if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                        jSONSerializer2.println();
                                    }
                                    serializeWriter.writeFieldName(str7, true);
                                } else {
                                    if (!z3) {
                                        serializeWriter.write(44);
                                    }
                                    if (serializeWriter.isEnabled(NON_STRINGKEY_AS_STRING)) {
                                        jSONSerializer2.write(JSON.toJSONString(str));
                                    } else {
                                        jSONSerializer2.write(JSON.toJSONString(str));
                                    }
                                    serializeWriter.write(58);
                                }
                                if (obj3 == null) {
                                    serializeWriter.writeNull();
                                    cls4 = cls;
                                    z3 = false;
                                } else {
                                    cls2 = obj3.getClass();
                                    if (cls2 != cls) {
                                        objectWriter = jSONSerializer2.getObjectWriter(cls2);
                                        cls = cls2;
                                    }
                                    objectSerializer = objectWriter;
                                    if (SerializerFeature.isEnabled(i2, SerializerFeature.WriteClassName)) {
                                        jSONSerializer2 = jSONSerializer;
                                        objectSerializer2 = objectSerializer;
                                        objectSerializer2.write(jSONSerializer2, obj3, str, null, i);
                                    } else {
                                        jSONSerializer2 = jSONSerializer;
                                        objectSerializer2 = objectSerializer;
                                        objectSerializer2.write(jSONSerializer2, obj3, str, null, i);
                                    }
                                    objectWriter = objectSerializer2;
                                    cls4 = cls;
                                    z3 = false;
                                }
                            } else {
                                list3 = this.propertyFilters;
                                if (list3 != null) {
                                    if (key != null) {
                                        if (!this.apply(jSONSerializer2, obj, key, value)) {
                                        }
                                    } else if (!this.apply(jSONSerializer2, obj, key, value)) {
                                    }
                                }
                                list4 = jSONSerializer2.nameFilters;
                                if (list4 != null) {
                                    if (key != null) {
                                        key = this.processKey(jSONSerializer2, obj, key, value);
                                    } else {
                                        key = this.processKey(jSONSerializer2, obj, key, value);
                                    }
                                }
                                list5 = this.nameFilters;
                                if (list5 != null) {
                                    if (key != null) {
                                        key = this.processKey(jSONSerializer2, obj, key, value);
                                    } else {
                                        key = this.processKey(jSONSerializer2, obj, key, value);
                                    }
                                }
                                if (key != null) {
                                    cls = cls4;
                                    str = key;
                                    jSONSerializer2 = jSONSerializer;
                                    i2 = i;
                                    value = processValue(jSONSerializer2, null, obj, str, value, i2);
                                } else if (key instanceof String) {
                                    cls = cls4;
                                    str = key;
                                    jSONSerializer2 = jSONSerializer;
                                    i2 = i;
                                    value = processValue(jSONSerializer2, null, obj, str, value, i2);
                                } else {
                                    if (key instanceof Map) {
                                        cls = cls4;
                                        str = key;
                                    } else {
                                        cls = cls4;
                                        str = key;
                                    }
                                    jSONSerializer2 = jSONSerializer;
                                    i2 = i;
                                }
                                obj3 = value;
                                if (obj3 == null) {
                                }
                                if (str instanceof String) {
                                    String str8 = str;
                                    if (!z3) {
                                        serializeWriter.write(44);
                                    }
                                    if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                        jSONSerializer2.println();
                                    }
                                    serializeWriter.writeFieldName(str8, true);
                                } else {
                                    if (!z3) {
                                        serializeWriter.write(44);
                                    }
                                    if (serializeWriter.isEnabled(NON_STRINGKEY_AS_STRING)) {
                                        jSONSerializer2.write(JSON.toJSONString(str));
                                    } else {
                                        jSONSerializer2.write(JSON.toJSONString(str));
                                    }
                                    serializeWriter.write(58);
                                }
                                if (obj3 == null) {
                                    serializeWriter.writeNull();
                                    cls4 = cls;
                                    z3 = false;
                                } else {
                                    cls2 = obj3.getClass();
                                    if (cls2 != cls) {
                                        objectWriter = jSONSerializer2.getObjectWriter(cls2);
                                        cls = cls2;
                                    }
                                    objectSerializer = objectWriter;
                                    if (SerializerFeature.isEnabled(i2, SerializerFeature.WriteClassName)) {
                                        jSONSerializer2 = jSONSerializer;
                                        objectSerializer2 = objectSerializer;
                                        objectSerializer2.write(jSONSerializer2, obj3, str, null, i);
                                    } else {
                                        jSONSerializer2 = jSONSerializer;
                                        objectSerializer2 = objectSerializer;
                                        objectSerializer2.write(jSONSerializer2, obj3, str, null, i);
                                    }
                                    objectWriter = objectSerializer2;
                                    cls4 = cls;
                                    z3 = false;
                                }
                            }
                        }
                    } else if ((!key.getClass().isPrimitive() && !(key instanceof Number)) || this.applyName(jSONSerializer2, obj, JSON.toJSONString(key))) {
                        list2 = jSONSerializer2.propertyFilters;
                        if (list2 != null) {
                            list3 = this.propertyFilters;
                            if (list3 != null) {
                                if (key != null) {
                                    if (!this.apply(jSONSerializer2, obj, key, value)) {
                                    }
                                } else if (!this.apply(jSONSerializer2, obj, key, value)) {
                                }
                            }
                            list4 = jSONSerializer2.nameFilters;
                            if (list4 != null) {
                                if (key != null) {
                                    key = this.processKey(jSONSerializer2, obj, key, value);
                                } else {
                                    key = this.processKey(jSONSerializer2, obj, key, value);
                                }
                            }
                            list5 = this.nameFilters;
                            if (list5 != null) {
                                if (key != null) {
                                    key = this.processKey(jSONSerializer2, obj, key, value);
                                } else {
                                    key = this.processKey(jSONSerializer2, obj, key, value);
                                }
                            }
                            if (key != null) {
                                cls = cls4;
                                str = key;
                                jSONSerializer2 = jSONSerializer;
                                i2 = i;
                                value = processValue(jSONSerializer2, null, obj, str, value, i2);
                            } else if (key instanceof String) {
                                cls = cls4;
                                str = key;
                                jSONSerializer2 = jSONSerializer;
                                i2 = i;
                                value = processValue(jSONSerializer2, null, obj, str, value, i2);
                            } else {
                                if (key instanceof Map) {
                                    cls = cls4;
                                    str = key;
                                } else {
                                    cls = cls4;
                                    str = key;
                                }
                                jSONSerializer2 = jSONSerializer;
                                i2 = i;
                            }
                            obj3 = value;
                            if (obj3 == null) {
                            }
                            if (str instanceof String) {
                                String str9 = str;
                                if (!z3) {
                                    serializeWriter.write(44);
                                }
                                if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                    jSONSerializer2.println();
                                }
                                serializeWriter.writeFieldName(str9, true);
                            } else {
                                if (!z3) {
                                    serializeWriter.write(44);
                                }
                                if (serializeWriter.isEnabled(NON_STRINGKEY_AS_STRING)) {
                                    jSONSerializer2.write(JSON.toJSONString(str));
                                } else {
                                    jSONSerializer2.write(JSON.toJSONString(str));
                                }
                                serializeWriter.write(58);
                            }
                            if (obj3 == null) {
                                serializeWriter.writeNull();
                                cls4 = cls;
                                z3 = false;
                            } else {
                                cls2 = obj3.getClass();
                                if (cls2 != cls) {
                                    objectWriter = jSONSerializer2.getObjectWriter(cls2);
                                    cls = cls2;
                                }
                                objectSerializer = objectWriter;
                                if (SerializerFeature.isEnabled(i2, SerializerFeature.WriteClassName)) {
                                    jSONSerializer2 = jSONSerializer;
                                    objectSerializer2 = objectSerializer;
                                    objectSerializer2.write(jSONSerializer2, obj3, str, null, i);
                                } else {
                                    jSONSerializer2 = jSONSerializer;
                                    objectSerializer2 = objectSerializer;
                                    objectSerializer2.write(jSONSerializer2, obj3, str, null, i);
                                }
                                objectWriter = objectSerializer2;
                                cls4 = cls;
                                z3 = false;
                            }
                        } else {
                            list3 = this.propertyFilters;
                            if (list3 != null) {
                                if (key != null) {
                                    if (!this.apply(jSONSerializer2, obj, key, value)) {
                                    }
                                } else if (!this.apply(jSONSerializer2, obj, key, value)) {
                                }
                            }
                            list4 = jSONSerializer2.nameFilters;
                            if (list4 != null) {
                                if (key != null) {
                                    key = this.processKey(jSONSerializer2, obj, key, value);
                                } else {
                                    key = this.processKey(jSONSerializer2, obj, key, value);
                                }
                            }
                            list5 = this.nameFilters;
                            if (list5 != null) {
                                if (key != null) {
                                    key = this.processKey(jSONSerializer2, obj, key, value);
                                } else {
                                    key = this.processKey(jSONSerializer2, obj, key, value);
                                }
                            }
                            if (key != null) {
                                cls = cls4;
                                str = key;
                                jSONSerializer2 = jSONSerializer;
                                i2 = i;
                                value = processValue(jSONSerializer2, null, obj, str, value, i2);
                            } else if (key instanceof String) {
                                cls = cls4;
                                str = key;
                                jSONSerializer2 = jSONSerializer;
                                i2 = i;
                                value = processValue(jSONSerializer2, null, obj, str, value, i2);
                            } else {
                                if (key instanceof Map) {
                                    cls = cls4;
                                    str = key;
                                } else {
                                    cls = cls4;
                                    str = key;
                                }
                                jSONSerializer2 = jSONSerializer;
                                i2 = i;
                            }
                            obj3 = value;
                            if (obj3 == null) {
                            }
                            if (str instanceof String) {
                                String str10 = str;
                                if (!z3) {
                                    serializeWriter.write(44);
                                }
                                if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                    jSONSerializer2.println();
                                }
                                serializeWriter.writeFieldName(str10, true);
                            } else {
                                if (!z3) {
                                    serializeWriter.write(44);
                                }
                                if (serializeWriter.isEnabled(NON_STRINGKEY_AS_STRING)) {
                                    jSONSerializer2.write(JSON.toJSONString(str));
                                } else {
                                    jSONSerializer2.write(JSON.toJSONString(str));
                                }
                                serializeWriter.write(58);
                            }
                            if (obj3 == null) {
                                serializeWriter.writeNull();
                                cls4 = cls;
                                z3 = false;
                            } else {
                                cls2 = obj3.getClass();
                                if (cls2 != cls) {
                                    objectWriter = jSONSerializer2.getObjectWriter(cls2);
                                    cls = cls2;
                                }
                                objectSerializer = objectWriter;
                                if (SerializerFeature.isEnabled(i2, SerializerFeature.WriteClassName)) {
                                    jSONSerializer2 = jSONSerializer;
                                    objectSerializer2 = objectSerializer;
                                    objectSerializer2.write(jSONSerializer2, obj3, str, null, i);
                                } else {
                                    jSONSerializer2 = jSONSerializer;
                                    objectSerializer2 = objectSerializer;
                                    objectSerializer2.write(jSONSerializer2, obj3, str, null, i);
                                }
                                objectWriter = objectSerializer2;
                                cls4 = cls;
                                z3 = false;
                            }
                        }
                    }
                    cls = cls4;
                    cls4 = cls;
                }
            } else {
                if (key == null || (key instanceof String)) {
                    if (this.applyName(jSONSerializer2, obj, key)) {
                        list = this.propertyPreFilters;
                        if (list != null) {
                            list2 = jSONSerializer2.propertyFilters;
                            if (list2 != null) {
                                list3 = this.propertyFilters;
                                if (list3 != null) {
                                    if (key != null) {
                                        if (!this.apply(jSONSerializer2, obj, key, value)) {
                                        }
                                    } else if (!this.apply(jSONSerializer2, obj, key, value)) {
                                    }
                                }
                                list4 = jSONSerializer2.nameFilters;
                                if (list4 != null) {
                                    if (key != null) {
                                        key = this.processKey(jSONSerializer2, obj, key, value);
                                    } else {
                                        key = this.processKey(jSONSerializer2, obj, key, value);
                                    }
                                }
                                list5 = this.nameFilters;
                                if (list5 != null) {
                                    if (key != null) {
                                        key = this.processKey(jSONSerializer2, obj, key, value);
                                    } else {
                                        key = this.processKey(jSONSerializer2, obj, key, value);
                                    }
                                }
                                if (key != null) {
                                    cls = cls4;
                                    str = key;
                                    jSONSerializer2 = jSONSerializer;
                                    i2 = i;
                                    value = processValue(jSONSerializer2, null, obj, str, value, i2);
                                } else if (key instanceof String) {
                                    cls = cls4;
                                    str = key;
                                    jSONSerializer2 = jSONSerializer;
                                    i2 = i;
                                    value = processValue(jSONSerializer2, null, obj, str, value, i2);
                                } else {
                                    if (key instanceof Map) {
                                        cls = cls4;
                                        str = key;
                                    } else {
                                        cls = cls4;
                                        str = key;
                                    }
                                    jSONSerializer2 = jSONSerializer;
                                    i2 = i;
                                }
                                obj3 = value;
                                if (obj3 == null) {
                                }
                                if (str instanceof String) {
                                    String str11 = str;
                                    if (!z3) {
                                        serializeWriter.write(44);
                                    }
                                    if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                        jSONSerializer2.println();
                                    }
                                    serializeWriter.writeFieldName(str11, true);
                                } else {
                                    if (!z3) {
                                        serializeWriter.write(44);
                                    }
                                    if (serializeWriter.isEnabled(NON_STRINGKEY_AS_STRING)) {
                                        jSONSerializer2.write(JSON.toJSONString(str));
                                    } else {
                                        jSONSerializer2.write(JSON.toJSONString(str));
                                    }
                                    serializeWriter.write(58);
                                }
                                if (obj3 == null) {
                                    serializeWriter.writeNull();
                                    cls4 = cls;
                                    z3 = false;
                                } else {
                                    cls2 = obj3.getClass();
                                    if (cls2 != cls) {
                                        objectWriter = jSONSerializer2.getObjectWriter(cls2);
                                        cls = cls2;
                                    }
                                    objectSerializer = objectWriter;
                                    if (SerializerFeature.isEnabled(i2, SerializerFeature.WriteClassName)) {
                                        jSONSerializer2 = jSONSerializer;
                                        objectSerializer2 = objectSerializer;
                                        objectSerializer2.write(jSONSerializer2, obj3, str, null, i);
                                    } else {
                                        jSONSerializer2 = jSONSerializer;
                                        objectSerializer2 = objectSerializer;
                                        objectSerializer2.write(jSONSerializer2, obj3, str, null, i);
                                    }
                                    objectWriter = objectSerializer2;
                                    cls4 = cls;
                                    z3 = false;
                                }
                            } else {
                                list3 = this.propertyFilters;
                                if (list3 != null) {
                                    if (key != null) {
                                        if (!this.apply(jSONSerializer2, obj, key, value)) {
                                        }
                                    } else if (!this.apply(jSONSerializer2, obj, key, value)) {
                                    }
                                }
                                list4 = jSONSerializer2.nameFilters;
                                if (list4 != null) {
                                    if (key != null) {
                                        key = this.processKey(jSONSerializer2, obj, key, value);
                                    } else {
                                        key = this.processKey(jSONSerializer2, obj, key, value);
                                    }
                                }
                                list5 = this.nameFilters;
                                if (list5 != null) {
                                    if (key != null) {
                                        key = this.processKey(jSONSerializer2, obj, key, value);
                                    } else {
                                        key = this.processKey(jSONSerializer2, obj, key, value);
                                    }
                                }
                                if (key != null) {
                                    cls = cls4;
                                    str = key;
                                    jSONSerializer2 = jSONSerializer;
                                    i2 = i;
                                    value = processValue(jSONSerializer2, null, obj, str, value, i2);
                                } else if (key instanceof String) {
                                    cls = cls4;
                                    str = key;
                                    jSONSerializer2 = jSONSerializer;
                                    i2 = i;
                                    value = processValue(jSONSerializer2, null, obj, str, value, i2);
                                } else {
                                    if (key instanceof Map) {
                                        cls = cls4;
                                        str = key;
                                    } else {
                                        cls = cls4;
                                        str = key;
                                    }
                                    jSONSerializer2 = jSONSerializer;
                                    i2 = i;
                                }
                                obj3 = value;
                                if (obj3 == null) {
                                }
                                if (str instanceof String) {
                                    String str12 = str;
                                    if (!z3) {
                                        serializeWriter.write(44);
                                    }
                                    if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                        jSONSerializer2.println();
                                    }
                                    serializeWriter.writeFieldName(str12, true);
                                } else {
                                    if (!z3) {
                                        serializeWriter.write(44);
                                    }
                                    if (serializeWriter.isEnabled(NON_STRINGKEY_AS_STRING)) {
                                        jSONSerializer2.write(JSON.toJSONString(str));
                                    } else {
                                        jSONSerializer2.write(JSON.toJSONString(str));
                                    }
                                    serializeWriter.write(58);
                                }
                                if (obj3 == null) {
                                    serializeWriter.writeNull();
                                    cls4 = cls;
                                    z3 = false;
                                } else {
                                    cls2 = obj3.getClass();
                                    if (cls2 != cls) {
                                        objectWriter = jSONSerializer2.getObjectWriter(cls2);
                                        cls = cls2;
                                    }
                                    objectSerializer = objectWriter;
                                    if (SerializerFeature.isEnabled(i2, SerializerFeature.WriteClassName)) {
                                        jSONSerializer2 = jSONSerializer;
                                        objectSerializer2 = objectSerializer;
                                        objectSerializer2.write(jSONSerializer2, obj3, str, null, i);
                                    } else {
                                        jSONSerializer2 = jSONSerializer;
                                        objectSerializer2 = objectSerializer;
                                        objectSerializer2.write(jSONSerializer2, obj3, str, null, i);
                                    }
                                    objectWriter = objectSerializer2;
                                    cls4 = cls;
                                    z3 = false;
                                }
                            }
                        } else {
                            list2 = jSONSerializer2.propertyFilters;
                            if (list2 != null) {
                                list3 = this.propertyFilters;
                                if (list3 != null) {
                                    if (key != null) {
                                        if (!this.apply(jSONSerializer2, obj, key, value)) {
                                        }
                                    } else if (!this.apply(jSONSerializer2, obj, key, value)) {
                                    }
                                }
                                list4 = jSONSerializer2.nameFilters;
                                if (list4 != null) {
                                    if (key != null) {
                                        key = this.processKey(jSONSerializer2, obj, key, value);
                                    } else {
                                        key = this.processKey(jSONSerializer2, obj, key, value);
                                    }
                                }
                                list5 = this.nameFilters;
                                if (list5 != null) {
                                    if (key != null) {
                                        key = this.processKey(jSONSerializer2, obj, key, value);
                                    } else {
                                        key = this.processKey(jSONSerializer2, obj, key, value);
                                    }
                                }
                                if (key != null) {
                                    cls = cls4;
                                    str = key;
                                    jSONSerializer2 = jSONSerializer;
                                    i2 = i;
                                    value = processValue(jSONSerializer2, null, obj, str, value, i2);
                                } else if (key instanceof String) {
                                    cls = cls4;
                                    str = key;
                                    jSONSerializer2 = jSONSerializer;
                                    i2 = i;
                                    value = processValue(jSONSerializer2, null, obj, str, value, i2);
                                } else {
                                    if (key instanceof Map) {
                                        cls = cls4;
                                        str = key;
                                    } else {
                                        cls = cls4;
                                        str = key;
                                    }
                                    jSONSerializer2 = jSONSerializer;
                                    i2 = i;
                                }
                                obj3 = value;
                                if (obj3 == null) {
                                }
                                if (str instanceof String) {
                                    String str13 = str;
                                    if (!z3) {
                                        serializeWriter.write(44);
                                    }
                                    if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                        jSONSerializer2.println();
                                    }
                                    serializeWriter.writeFieldName(str13, true);
                                } else {
                                    if (!z3) {
                                        serializeWriter.write(44);
                                    }
                                    if (serializeWriter.isEnabled(NON_STRINGKEY_AS_STRING)) {
                                        jSONSerializer2.write(JSON.toJSONString(str));
                                    } else {
                                        jSONSerializer2.write(JSON.toJSONString(str));
                                    }
                                    serializeWriter.write(58);
                                }
                                if (obj3 == null) {
                                    serializeWriter.writeNull();
                                    cls4 = cls;
                                    z3 = false;
                                } else {
                                    cls2 = obj3.getClass();
                                    if (cls2 != cls) {
                                        objectWriter = jSONSerializer2.getObjectWriter(cls2);
                                        cls = cls2;
                                    }
                                    objectSerializer = objectWriter;
                                    if (SerializerFeature.isEnabled(i2, SerializerFeature.WriteClassName)) {
                                        jSONSerializer2 = jSONSerializer;
                                        objectSerializer2 = objectSerializer;
                                        objectSerializer2.write(jSONSerializer2, obj3, str, null, i);
                                    } else {
                                        jSONSerializer2 = jSONSerializer;
                                        objectSerializer2 = objectSerializer;
                                        objectSerializer2.write(jSONSerializer2, obj3, str, null, i);
                                    }
                                    objectWriter = objectSerializer2;
                                    cls4 = cls;
                                    z3 = false;
                                }
                            } else {
                                list3 = this.propertyFilters;
                                if (list3 != null) {
                                    if (key != null) {
                                        if (!this.apply(jSONSerializer2, obj, key, value)) {
                                        }
                                    } else if (!this.apply(jSONSerializer2, obj, key, value)) {
                                    }
                                }
                                list4 = jSONSerializer2.nameFilters;
                                if (list4 != null) {
                                    if (key != null) {
                                        key = this.processKey(jSONSerializer2, obj, key, value);
                                    } else {
                                        key = this.processKey(jSONSerializer2, obj, key, value);
                                    }
                                }
                                list5 = this.nameFilters;
                                if (list5 != null) {
                                    if (key != null) {
                                        key = this.processKey(jSONSerializer2, obj, key, value);
                                    } else {
                                        key = this.processKey(jSONSerializer2, obj, key, value);
                                    }
                                }
                                if (key != null) {
                                    cls = cls4;
                                    str = key;
                                    jSONSerializer2 = jSONSerializer;
                                    i2 = i;
                                    value = processValue(jSONSerializer2, null, obj, str, value, i2);
                                } else if (key instanceof String) {
                                    cls = cls4;
                                    str = key;
                                    jSONSerializer2 = jSONSerializer;
                                    i2 = i;
                                    value = processValue(jSONSerializer2, null, obj, str, value, i2);
                                } else {
                                    if (key instanceof Map) {
                                        cls = cls4;
                                        str = key;
                                    } else {
                                        cls = cls4;
                                        str = key;
                                    }
                                    jSONSerializer2 = jSONSerializer;
                                    i2 = i;
                                }
                                obj3 = value;
                                if (obj3 == null) {
                                }
                                if (str instanceof String) {
                                    String str14 = str;
                                    if (!z3) {
                                        serializeWriter.write(44);
                                    }
                                    if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                        jSONSerializer2.println();
                                    }
                                    serializeWriter.writeFieldName(str14, true);
                                } else {
                                    if (!z3) {
                                        serializeWriter.write(44);
                                    }
                                    if (serializeWriter.isEnabled(NON_STRINGKEY_AS_STRING)) {
                                        jSONSerializer2.write(JSON.toJSONString(str));
                                    } else {
                                        jSONSerializer2.write(JSON.toJSONString(str));
                                    }
                                    serializeWriter.write(58);
                                }
                                if (obj3 == null) {
                                    serializeWriter.writeNull();
                                    cls4 = cls;
                                    z3 = false;
                                } else {
                                    cls2 = obj3.getClass();
                                    if (cls2 != cls) {
                                        objectWriter = jSONSerializer2.getObjectWriter(cls2);
                                        cls = cls2;
                                    }
                                    objectSerializer = objectWriter;
                                    if (SerializerFeature.isEnabled(i2, SerializerFeature.WriteClassName)) {
                                        jSONSerializer2 = jSONSerializer;
                                        objectSerializer2 = objectSerializer;
                                        objectSerializer2.write(jSONSerializer2, obj3, str, null, i);
                                    } else {
                                        jSONSerializer2 = jSONSerializer;
                                        objectSerializer2 = objectSerializer;
                                        objectSerializer2.write(jSONSerializer2, obj3, str, null, i);
                                    }
                                    objectWriter = objectSerializer2;
                                    cls4 = cls;
                                    z3 = false;
                                }
                            }
                        }
                    }
                } else if ((!key.getClass().isPrimitive() && !(key instanceof Number)) || this.applyName(jSONSerializer2, obj, JSON.toJSONString(key))) {
                    list = this.propertyPreFilters;
                    if (list != null) {
                        list2 = jSONSerializer2.propertyFilters;
                        if (list2 != null) {
                            list3 = this.propertyFilters;
                            if (list3 != null) {
                                if (key != null) {
                                    if (!this.apply(jSONSerializer2, obj, key, value)) {
                                    }
                                } else if (!this.apply(jSONSerializer2, obj, key, value)) {
                                }
                            }
                            list4 = jSONSerializer2.nameFilters;
                            if (list4 != null) {
                                if (key != null) {
                                    key = this.processKey(jSONSerializer2, obj, key, value);
                                } else {
                                    key = this.processKey(jSONSerializer2, obj, key, value);
                                }
                            }
                            list5 = this.nameFilters;
                            if (list5 != null) {
                                if (key != null) {
                                    key = this.processKey(jSONSerializer2, obj, key, value);
                                } else {
                                    key = this.processKey(jSONSerializer2, obj, key, value);
                                }
                            }
                            if (key != null) {
                                cls = cls4;
                                str = key;
                                jSONSerializer2 = jSONSerializer;
                                i2 = i;
                                value = processValue(jSONSerializer2, null, obj, str, value, i2);
                            } else if (key instanceof String) {
                                cls = cls4;
                                str = key;
                                jSONSerializer2 = jSONSerializer;
                                i2 = i;
                                value = processValue(jSONSerializer2, null, obj, str, value, i2);
                            } else {
                                if (key instanceof Map) {
                                    cls = cls4;
                                    str = key;
                                } else {
                                    cls = cls4;
                                    str = key;
                                }
                                jSONSerializer2 = jSONSerializer;
                                i2 = i;
                            }
                            obj3 = value;
                            if (obj3 == null) {
                            }
                            if (str instanceof String) {
                                String str15 = str;
                                if (!z3) {
                                    serializeWriter.write(44);
                                }
                                if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                    jSONSerializer2.println();
                                }
                                serializeWriter.writeFieldName(str15, true);
                            } else {
                                if (!z3) {
                                    serializeWriter.write(44);
                                }
                                if (serializeWriter.isEnabled(NON_STRINGKEY_AS_STRING)) {
                                    jSONSerializer2.write(JSON.toJSONString(str));
                                } else {
                                    jSONSerializer2.write(JSON.toJSONString(str));
                                }
                                serializeWriter.write(58);
                            }
                            if (obj3 == null) {
                                serializeWriter.writeNull();
                                cls4 = cls;
                                z3 = false;
                            } else {
                                cls2 = obj3.getClass();
                                if (cls2 != cls) {
                                    objectWriter = jSONSerializer2.getObjectWriter(cls2);
                                    cls = cls2;
                                }
                                objectSerializer = objectWriter;
                                if (SerializerFeature.isEnabled(i2, SerializerFeature.WriteClassName)) {
                                    jSONSerializer2 = jSONSerializer;
                                    objectSerializer2 = objectSerializer;
                                    objectSerializer2.write(jSONSerializer2, obj3, str, null, i);
                                } else {
                                    jSONSerializer2 = jSONSerializer;
                                    objectSerializer2 = objectSerializer;
                                    objectSerializer2.write(jSONSerializer2, obj3, str, null, i);
                                }
                                objectWriter = objectSerializer2;
                                cls4 = cls;
                                z3 = false;
                            }
                        } else {
                            list3 = this.propertyFilters;
                            if (list3 != null) {
                                if (key != null) {
                                    if (!this.apply(jSONSerializer2, obj, key, value)) {
                                    }
                                } else if (!this.apply(jSONSerializer2, obj, key, value)) {
                                }
                            }
                            list4 = jSONSerializer2.nameFilters;
                            if (list4 != null) {
                                if (key != null) {
                                    key = this.processKey(jSONSerializer2, obj, key, value);
                                } else {
                                    key = this.processKey(jSONSerializer2, obj, key, value);
                                }
                            }
                            list5 = this.nameFilters;
                            if (list5 != null) {
                                if (key != null) {
                                    key = this.processKey(jSONSerializer2, obj, key, value);
                                } else {
                                    key = this.processKey(jSONSerializer2, obj, key, value);
                                }
                            }
                            if (key != null) {
                                cls = cls4;
                                str = key;
                                jSONSerializer2 = jSONSerializer;
                                i2 = i;
                                value = processValue(jSONSerializer2, null, obj, str, value, i2);
                            } else if (key instanceof String) {
                                cls = cls4;
                                str = key;
                                jSONSerializer2 = jSONSerializer;
                                i2 = i;
                                value = processValue(jSONSerializer2, null, obj, str, value, i2);
                            } else {
                                if (key instanceof Map) {
                                    cls = cls4;
                                    str = key;
                                } else {
                                    cls = cls4;
                                    str = key;
                                }
                                jSONSerializer2 = jSONSerializer;
                                i2 = i;
                            }
                            obj3 = value;
                            if (obj3 == null) {
                            }
                            if (str instanceof String) {
                                String str16 = str;
                                if (!z3) {
                                    serializeWriter.write(44);
                                }
                                if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                    jSONSerializer2.println();
                                }
                                serializeWriter.writeFieldName(str16, true);
                            } else {
                                if (!z3) {
                                    serializeWriter.write(44);
                                }
                                if (serializeWriter.isEnabled(NON_STRINGKEY_AS_STRING)) {
                                    jSONSerializer2.write(JSON.toJSONString(str));
                                } else {
                                    jSONSerializer2.write(JSON.toJSONString(str));
                                }
                                serializeWriter.write(58);
                            }
                            if (obj3 == null) {
                                serializeWriter.writeNull();
                                cls4 = cls;
                                z3 = false;
                            } else {
                                cls2 = obj3.getClass();
                                if (cls2 != cls) {
                                    objectWriter = jSONSerializer2.getObjectWriter(cls2);
                                    cls = cls2;
                                }
                                objectSerializer = objectWriter;
                                if (SerializerFeature.isEnabled(i2, SerializerFeature.WriteClassName)) {
                                    jSONSerializer2 = jSONSerializer;
                                    objectSerializer2 = objectSerializer;
                                    objectSerializer2.write(jSONSerializer2, obj3, str, null, i);
                                } else {
                                    jSONSerializer2 = jSONSerializer;
                                    objectSerializer2 = objectSerializer;
                                    objectSerializer2.write(jSONSerializer2, obj3, str, null, i);
                                }
                                objectWriter = objectSerializer2;
                                cls4 = cls;
                                z3 = false;
                            }
                        }
                    } else {
                        list2 = jSONSerializer2.propertyFilters;
                        if (list2 != null) {
                            list3 = this.propertyFilters;
                            if (list3 != null) {
                                if (key != null) {
                                    if (!this.apply(jSONSerializer2, obj, key, value)) {
                                    }
                                } else if (!this.apply(jSONSerializer2, obj, key, value)) {
                                }
                            }
                            list4 = jSONSerializer2.nameFilters;
                            if (list4 != null) {
                                if (key != null) {
                                    key = this.processKey(jSONSerializer2, obj, key, value);
                                } else {
                                    key = this.processKey(jSONSerializer2, obj, key, value);
                                }
                            }
                            list5 = this.nameFilters;
                            if (list5 != null) {
                                if (key != null) {
                                    key = this.processKey(jSONSerializer2, obj, key, value);
                                } else {
                                    key = this.processKey(jSONSerializer2, obj, key, value);
                                }
                            }
                            if (key != null) {
                                cls = cls4;
                                str = key;
                                jSONSerializer2 = jSONSerializer;
                                i2 = i;
                                value = processValue(jSONSerializer2, null, obj, str, value, i2);
                            } else if (key instanceof String) {
                                cls = cls4;
                                str = key;
                                jSONSerializer2 = jSONSerializer;
                                i2 = i;
                                value = processValue(jSONSerializer2, null, obj, str, value, i2);
                            } else {
                                if (key instanceof Map) {
                                    cls = cls4;
                                    str = key;
                                } else {
                                    cls = cls4;
                                    str = key;
                                }
                                jSONSerializer2 = jSONSerializer;
                                i2 = i;
                            }
                            obj3 = value;
                            if (obj3 == null) {
                            }
                            if (str instanceof String) {
                                String str17 = str;
                                if (!z3) {
                                    serializeWriter.write(44);
                                }
                                if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                    jSONSerializer2.println();
                                }
                                serializeWriter.writeFieldName(str17, true);
                            } else {
                                if (!z3) {
                                    serializeWriter.write(44);
                                }
                                if (serializeWriter.isEnabled(NON_STRINGKEY_AS_STRING)) {
                                    jSONSerializer2.write(JSON.toJSONString(str));
                                } else {
                                    jSONSerializer2.write(JSON.toJSONString(str));
                                }
                                serializeWriter.write(58);
                            }
                            if (obj3 == null) {
                                serializeWriter.writeNull();
                                cls4 = cls;
                                z3 = false;
                            } else {
                                cls2 = obj3.getClass();
                                if (cls2 != cls) {
                                    objectWriter = jSONSerializer2.getObjectWriter(cls2);
                                    cls = cls2;
                                }
                                objectSerializer = objectWriter;
                                if (SerializerFeature.isEnabled(i2, SerializerFeature.WriteClassName)) {
                                    jSONSerializer2 = jSONSerializer;
                                    objectSerializer2 = objectSerializer;
                                    objectSerializer2.write(jSONSerializer2, obj3, str, null, i);
                                } else {
                                    jSONSerializer2 = jSONSerializer;
                                    objectSerializer2 = objectSerializer;
                                    objectSerializer2.write(jSONSerializer2, obj3, str, null, i);
                                }
                                objectWriter = objectSerializer2;
                                cls4 = cls;
                                z3 = false;
                            }
                        } else {
                            list3 = this.propertyFilters;
                            if (list3 != null) {
                                if (key != null) {
                                    if (!this.apply(jSONSerializer2, obj, key, value)) {
                                    }
                                } else if (!this.apply(jSONSerializer2, obj, key, value)) {
                                }
                            }
                            list4 = jSONSerializer2.nameFilters;
                            if (list4 != null) {
                                if (key != null) {
                                    key = this.processKey(jSONSerializer2, obj, key, value);
                                } else {
                                    key = this.processKey(jSONSerializer2, obj, key, value);
                                }
                            }
                            list5 = this.nameFilters;
                            if (list5 != null) {
                                if (key != null) {
                                    key = this.processKey(jSONSerializer2, obj, key, value);
                                } else {
                                    key = this.processKey(jSONSerializer2, obj, key, value);
                                }
                            }
                            if (key != null) {
                                cls = cls4;
                                str = key;
                                jSONSerializer2 = jSONSerializer;
                                i2 = i;
                                value = processValue(jSONSerializer2, null, obj, str, value, i2);
                            } else if (key instanceof String) {
                                cls = cls4;
                                str = key;
                                jSONSerializer2 = jSONSerializer;
                                i2 = i;
                                value = processValue(jSONSerializer2, null, obj, str, value, i2);
                            } else {
                                if (key instanceof Map) {
                                    cls = cls4;
                                    str = key;
                                } else {
                                    cls = cls4;
                                    str = key;
                                }
                                jSONSerializer2 = jSONSerializer;
                                i2 = i;
                            }
                            obj3 = value;
                            if (obj3 == null) {
                            }
                            if (str instanceof String) {
                                String str18 = str;
                                if (!z3) {
                                    serializeWriter.write(44);
                                }
                                if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                    jSONSerializer2.println();
                                }
                                serializeWriter.writeFieldName(str18, true);
                            } else {
                                if (!z3) {
                                    serializeWriter.write(44);
                                }
                                if (serializeWriter.isEnabled(NON_STRINGKEY_AS_STRING)) {
                                    jSONSerializer2.write(JSON.toJSONString(str));
                                } else {
                                    jSONSerializer2.write(JSON.toJSONString(str));
                                }
                                serializeWriter.write(58);
                            }
                            if (obj3 == null) {
                                serializeWriter.writeNull();
                                cls4 = cls;
                                z3 = false;
                            } else {
                                cls2 = obj3.getClass();
                                if (cls2 != cls) {
                                    objectWriter = jSONSerializer2.getObjectWriter(cls2);
                                    cls = cls2;
                                }
                                objectSerializer = objectWriter;
                                if (SerializerFeature.isEnabled(i2, SerializerFeature.WriteClassName)) {
                                    jSONSerializer2 = jSONSerializer;
                                    objectSerializer2 = objectSerializer;
                                    objectSerializer2.write(jSONSerializer2, obj3, str, null, i);
                                } else {
                                    jSONSerializer2 = jSONSerializer;
                                    objectSerializer2 = objectSerializer;
                                    objectSerializer2.write(jSONSerializer2, obj3, str, null, i);
                                }
                                objectWriter = objectSerializer2;
                                cls4 = cls;
                                z3 = false;
                            }
                        }
                    }
                }
                cls = cls4;
                cls4 = cls;
            }
        }
        jSONSerializer2.context = serialContext;
        jSONSerializer2.decrementIdent();
        if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat) && treeMap.size() > 0) {
            jSONSerializer2.println();
        }
        if (z) {
            return;
        }
        serializeWriter.write(125);
    }

    @Override // com.alibaba.fastjson.serializer.ObjectSerializer
    public void write(JSONSerializer jSONSerializer, Object obj, Object obj2, Type type, int i) throws Throwable {
        write(jSONSerializer, obj, obj2, type, i, false);
    }
}

package com.alibaba.fastjson.serializer;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alibaba.fastjson.parser.ParseContext;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import com.facebook.AuthenticationTokenClaims;
import com.immomo.momomediaext.sei.BaseSei;
import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.awt.Rectangle;
import java.io.IOException;
import java.lang.reflect.Type;
import p149l.riq;
import p149l.siq;
import p149l.xiq;

/* JADX INFO: loaded from: classes.dex */
public class AwtCodec implements ObjectSerializer, ObjectDeserializer {
    public static final AwtCodec instance = new AwtCodec();

    private Object parseRef(DefaultJSONParser defaultJSONParser, Object obj) {
        JSONLexer lexer = defaultJSONParser.getLexer();
        lexer.nextTokenWithColon(4);
        String strStringVal = lexer.stringVal();
        defaultJSONParser.setContext(defaultJSONParser.getContext(), obj);
        defaultJSONParser.addResolveTask(new DefaultJSONParser.ResolveTask(defaultJSONParser.getContext(), strStringVal));
        defaultJSONParser.popContext();
        defaultJSONParser.setResolveStatus(1);
        lexer.nextToken(13);
        defaultJSONParser.accept(13);
        return null;
    }

    public static boolean support(Class<?> cls) {
        return cls == Point.class || cls == Rectangle.class || cls == Font.class || cls == Color.class;
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public <T> T deserialze(DefaultJSONParser defaultJSONParser, Type type, Object obj) {
        T t;
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        if (jSONLexer.token() == 8) {
            jSONLexer.nextToken(16);
            return null;
        }
        if (jSONLexer.token() != 12 && jSONLexer.token() != 16) {
            riq.m179531a("syntax error");
            return null;
        }
        jSONLexer.nextToken();
        if (type == Point.class) {
            t = (T) parsePoint(defaultJSONParser, obj);
        } else if (type == Rectangle.class) {
            t = (T) parseRectangle(defaultJSONParser);
        } else if (type == Color.class) {
            t = (T) parseColor(defaultJSONParser);
        } else {
            if (type != Font.class) {
                siq.m184351a("not support awt class : ", type);
                return null;
            }
            t = (T) parseFont(defaultJSONParser);
        }
        ParseContext context = defaultJSONParser.getContext();
        defaultJSONParser.setContext(t, obj);
        defaultJSONParser.setContext(context);
        return t;
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public int getFastMatchToken() {
        return 12;
    }

    public Color parseColor(DefaultJSONParser defaultJSONParser) {
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (jSONLexer.token() != 13) {
            if (jSONLexer.token() != 4) {
                riq.m179531a("syntax error");
                return null;
            }
            String strStringVal = jSONLexer.stringVal();
            jSONLexer.nextTokenWithColon(2);
            if (jSONLexer.token() != 2) {
                riq.m179531a("syntax error");
                return null;
            }
            int iIntValue = jSONLexer.intValue();
            jSONLexer.nextToken();
            if (strStringVal.equalsIgnoreCase("r")) {
                i = iIntValue;
            } else if (strStringVal.equalsIgnoreCase("g")) {
                i2 = iIntValue;
            } else if (strStringVal.equalsIgnoreCase("b")) {
                i3 = iIntValue;
            } else {
                if (!strStringVal.equalsIgnoreCase("alpha")) {
                    riq.m179531a("syntax error, ".concat(strStringVal));
                    return null;
                }
                i4 = iIntValue;
            }
            if (jSONLexer.token() == 16) {
                jSONLexer.nextToken(4);
            }
        }
        jSONLexer.nextToken();
        return new Color(i, i2, i3, i4);
    }

    public Font parseFont(DefaultJSONParser defaultJSONParser) {
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        int iIntValue = 0;
        int iIntValue2 = 0;
        String strStringVal = null;
        while (jSONLexer.token() != 13) {
            if (jSONLexer.token() != 4) {
                riq.m179531a("syntax error");
                return null;
            }
            String strStringVal2 = jSONLexer.stringVal();
            jSONLexer.nextTokenWithColon(2);
            if (strStringVal2.equalsIgnoreCase(AuthenticationTokenClaims.JSON_KEY_NAME)) {
                if (jSONLexer.token() != 4) {
                    riq.m179531a("syntax error");
                    return null;
                }
                strStringVal = jSONLexer.stringVal();
                jSONLexer.nextToken();
            } else if (strStringVal2.equalsIgnoreCase("style")) {
                if (jSONLexer.token() != 2) {
                    riq.m179531a("syntax error");
                    return null;
                }
                iIntValue = jSONLexer.intValue();
                jSONLexer.nextToken();
            } else {
                if (!strStringVal2.equalsIgnoreCase("size")) {
                    riq.m179531a("syntax error, ".concat(strStringVal2));
                    return null;
                }
                if (jSONLexer.token() != 2) {
                    riq.m179531a("syntax error");
                    return null;
                }
                iIntValue2 = jSONLexer.intValue();
                jSONLexer.nextToken();
            }
            if (jSONLexer.token() == 16) {
                jSONLexer.nextToken(4);
            }
        }
        jSONLexer.nextToken();
        return new Font(strStringVal, iIntValue, iIntValue2);
    }

    public Point parsePoint(DefaultJSONParser defaultJSONParser, Object obj) {
        int iFloatValue;
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        int i = 0;
        int i2 = 0;
        while (jSONLexer.token() != 13) {
            if (jSONLexer.token() != 4) {
                riq.m179531a("syntax error");
                return null;
            }
            String strStringVal = jSONLexer.stringVal();
            if (JSON.DEFAULT_TYPE_KEY.equals(strStringVal)) {
                defaultJSONParser.acceptType("java.awt.Point");
            } else {
                if ("$ref".equals(strStringVal)) {
                    return (Point) parseRef(defaultJSONParser, obj);
                }
                jSONLexer.nextTokenWithColon(2);
                int i3 = jSONLexer.token();
                if (i3 == 2) {
                    iFloatValue = jSONLexer.intValue();
                    jSONLexer.nextToken();
                } else {
                    if (i3 != 3) {
                        xiq.m209674a("syntax error : ", jSONLexer.tokenName());
                        return null;
                    }
                    iFloatValue = (int) jSONLexer.floatValue();
                    jSONLexer.nextToken();
                }
                if (strStringVal.equalsIgnoreCase(BaseSei.f13930X)) {
                    i = iFloatValue;
                } else {
                    if (!strStringVal.equalsIgnoreCase(BaseSei.f13931Y)) {
                        riq.m179531a("syntax error, ".concat(strStringVal));
                        return null;
                    }
                    i2 = iFloatValue;
                }
                if (jSONLexer.token() == 16) {
                    jSONLexer.nextToken(4);
                }
            }
        }
        jSONLexer.nextToken();
        return new Point(i, i2);
    }

    public Rectangle parseRectangle(DefaultJSONParser defaultJSONParser) {
        int iFloatValue;
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (jSONLexer.token() != 13) {
            if (jSONLexer.token() != 4) {
                riq.m179531a("syntax error");
                return null;
            }
            String strStringVal = jSONLexer.stringVal();
            jSONLexer.nextTokenWithColon(2);
            int i5 = jSONLexer.token();
            if (i5 == 2) {
                iFloatValue = jSONLexer.intValue();
                jSONLexer.nextToken();
            } else {
                if (i5 != 3) {
                    riq.m179531a("syntax error");
                    return null;
                }
                iFloatValue = (int) jSONLexer.floatValue();
                jSONLexer.nextToken();
            }
            if (strStringVal.equalsIgnoreCase(BaseSei.f13930X)) {
                i = iFloatValue;
            } else if (strStringVal.equalsIgnoreCase(BaseSei.f13931Y)) {
                i2 = iFloatValue;
            } else if (strStringVal.equalsIgnoreCase("width")) {
                i3 = iFloatValue;
            } else {
                if (!strStringVal.equalsIgnoreCase("height")) {
                    riq.m179531a("syntax error, ".concat(strStringVal));
                    return null;
                }
                i4 = iFloatValue;
            }
            if (jSONLexer.token() == 16) {
                jSONLexer.nextToken(4);
            }
        }
        jSONLexer.nextToken();
        return new Rectangle(i, i2, i3, i4);
    }

    @Override // com.alibaba.fastjson.serializer.ObjectSerializer
    public void write(JSONSerializer jSONSerializer, Object obj, Object obj2, Type type, int i) throws IOException {
        SerializeWriter serializeWriter = jSONSerializer.out;
        if (obj == null) {
            serializeWriter.writeNull();
            return;
        }
        if (obj instanceof Point) {
            Point point = (Point) obj;
            serializeWriter.writeFieldValue(writeClassName(serializeWriter, Point.class, '{'), BaseSei.f13930X, point.x);
            serializeWriter.writeFieldValue(',', BaseSei.f13931Y, point.y);
        } else if (obj instanceof Font) {
            Font font = (Font) obj;
            serializeWriter.writeFieldValue(writeClassName(serializeWriter, Font.class, '{'), AuthenticationTokenClaims.JSON_KEY_NAME, font.getName());
            serializeWriter.writeFieldValue(',', "style", font.getStyle());
            serializeWriter.writeFieldValue(',', "size", font.getSize());
        } else if (obj instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) obj;
            serializeWriter.writeFieldValue(writeClassName(serializeWriter, Rectangle.class, '{'), BaseSei.f13930X, rectangle.x);
            serializeWriter.writeFieldValue(',', BaseSei.f13931Y, rectangle.y);
            serializeWriter.writeFieldValue(',', "width", rectangle.width);
            serializeWriter.writeFieldValue(',', "height", rectangle.height);
        } else {
            if (!(obj instanceof Color)) {
                riq.m179531a("not support awt class : ".concat(obj.getClass().getName()));
                return;
            }
            Color color = (Color) obj;
            serializeWriter.writeFieldValue(writeClassName(serializeWriter, Color.class, '{'), "r", color.getRed());
            serializeWriter.writeFieldValue(',', "g", color.getGreen());
            serializeWriter.writeFieldValue(',', "b", color.getBlue());
            if (color.getAlpha() > 0) {
                serializeWriter.writeFieldValue(',', "alpha", color.getAlpha());
            }
        }
        serializeWriter.write(125);
    }

    public char writeClassName(SerializeWriter serializeWriter, Class<?> cls, char c) {
        if (!serializeWriter.isEnabled(SerializerFeature.WriteClassName)) {
            return c;
        }
        serializeWriter.write(123);
        serializeWriter.writeFieldName(JSON.DEFAULT_TYPE_KEY);
        serializeWriter.writeString(cls.getName());
        return ',';
    }
}

package mao.spring_boot_random_data.data;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


/**
 * Project name(项目名称)：spring_boot_random_data
 * Package(包名): mao.spring_boot_random_data.data
 * Class(类名): RandomData
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/4/16
 * Time(创建时间)： 18:51
 * Version(版本): 1.0
 * Description(描述)： 无
 */


@Component
@ConfigurationProperties(prefix = "data")
public class RandomData
{
    private long id;
    private long id2;
    private int id3;
    private int id4;
    private String uuid;
    private String value;

    /**
     * Gets id.
     *
     * @return the id
     */
    public long getId()
    {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(long id)
    {
        this.id = id;
    }

    /**
     * Gets id 2.
     *
     * @return the id 2
     */
    public long getId2()
    {
        return id2;
    }

    /**
     * Sets id 2.
     *
     * @param id2 the id 2
     */
    public void setId2(long id2)
    {
        this.id2 = id2;
    }

    /**
     * Gets id 3.
     *
     * @return the id 3
     */
    public int getId3()
    {
        return id3;
    }

    /**
     * Sets id 3.
     *
     * @param id3 the id 3
     */
    public void setId3(int id3)
    {
        this.id3 = id3;
    }

    /**
     * Gets id 4.
     *
     * @return the id 4
     */
    public int getId4()
    {
        return id4;
    }

    /**
     * Sets id 4.
     *
     * @param id4 the id 4
     */
    public void setId4(int id4)
    {
        this.id4 = id4;
    }

    /**
     * Gets uuid.
     *
     * @return the uuid
     */
    public String getUuid()
    {
        return uuid;
    }

    /**
     * Sets uuid.
     *
     * @param uuid the uuid
     */
    public void setUuid(String uuid)
    {
        this.uuid = uuid;
    }

    /**
     * Gets value.
     *
     * @return the value
     */
    public String getValue()
    {
        return value;
    }

    /**
     * Sets value.
     *
     * @param value the value
     */
    public void setValue(String value)
    {
        this.value = value;
    }

    @Override
    @SuppressWarnings("all")
    public String toString()
    {
        final StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("id：").append(id).append('\n');
        stringbuilder.append("id2：").append(id2).append('\n');
        stringbuilder.append("id3：").append(id3).append('\n');
        stringbuilder.append("id4：").append(id4).append('\n');
        stringbuilder.append("uuid：").append(uuid).append('\n');
        stringbuilder.append("value：").append(value).append('\n');
        return stringbuilder.toString();
    }
}
